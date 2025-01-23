package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BijibenEntity;
import com.entity.view.BijibenView;

import com.service.BijibenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 笔记本
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
@RestController
@RequestMapping("/bijiben")
public class BijibenController {
    @Autowired
    private BijibenService bijibenService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BijibenEntity bijiben, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			bijiben.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BijibenEntity> ew = new EntityWrapper<BijibenEntity>();


		PageUtils page = bijibenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bijiben), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BijibenEntity bijiben, 
		HttpServletRequest request){
        EntityWrapper<BijibenEntity> ew = new EntityWrapper<BijibenEntity>();

		PageUtils page = bijibenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bijiben), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BijibenEntity bijiben){
       	EntityWrapper<BijibenEntity> ew = new EntityWrapper<BijibenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bijiben, "bijiben")); 
        return R.ok().put("data", bijibenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BijibenEntity bijiben){
        EntityWrapper< BijibenEntity> ew = new EntityWrapper< BijibenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bijiben, "bijiben")); 
		BijibenView bijibenView =  bijibenService.selectView(ew);
		return R.ok("查询笔记本成功").put("data", bijibenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BijibenEntity bijiben = bijibenService.selectById(id);
        return R.ok().put("data", bijiben);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BijibenEntity bijiben = bijibenService.selectById(id);
        return R.ok().put("data", bijiben);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BijibenEntity bijiben, HttpServletRequest request){
    	bijiben.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bijiben);

        bijibenService.insert(bijiben);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BijibenEntity bijiben, HttpServletRequest request){
    	bijiben.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bijiben);

        bijibenService.insert(bijiben);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BijibenEntity bijiben, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bijiben);
        bijibenService.updateById(bijiben);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bijibenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
