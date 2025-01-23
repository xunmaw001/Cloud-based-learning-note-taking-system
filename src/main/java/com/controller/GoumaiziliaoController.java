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

import com.entity.GoumaiziliaoEntity;
import com.entity.view.GoumaiziliaoView;

import com.service.GoumaiziliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 购买资料
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
@RestController
@RequestMapping("/goumaiziliao")
public class GoumaiziliaoController {
    @Autowired
    private GoumaiziliaoService goumaiziliaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GoumaiziliaoEntity goumaiziliao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			goumaiziliao.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GoumaiziliaoEntity> ew = new EntityWrapper<GoumaiziliaoEntity>();


		PageUtils page = goumaiziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, goumaiziliao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GoumaiziliaoEntity goumaiziliao, 
		HttpServletRequest request){
        EntityWrapper<GoumaiziliaoEntity> ew = new EntityWrapper<GoumaiziliaoEntity>();

		PageUtils page = goumaiziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, goumaiziliao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GoumaiziliaoEntity goumaiziliao){
       	EntityWrapper<GoumaiziliaoEntity> ew = new EntityWrapper<GoumaiziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( goumaiziliao, "goumaiziliao")); 
        return R.ok().put("data", goumaiziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GoumaiziliaoEntity goumaiziliao){
        EntityWrapper< GoumaiziliaoEntity> ew = new EntityWrapper< GoumaiziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( goumaiziliao, "goumaiziliao")); 
		GoumaiziliaoView goumaiziliaoView =  goumaiziliaoService.selectView(ew);
		return R.ok("查询购买资料成功").put("data", goumaiziliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GoumaiziliaoEntity goumaiziliao = goumaiziliaoService.selectById(id);
        return R.ok().put("data", goumaiziliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GoumaiziliaoEntity goumaiziliao = goumaiziliaoService.selectById(id);
        return R.ok().put("data", goumaiziliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GoumaiziliaoEntity goumaiziliao, HttpServletRequest request){
    	goumaiziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(goumaiziliao);

        goumaiziliaoService.insert(goumaiziliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody GoumaiziliaoEntity goumaiziliao, HttpServletRequest request){
    	goumaiziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(goumaiziliao);

        goumaiziliaoService.insert(goumaiziliao);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GoumaiziliaoEntity goumaiziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(goumaiziliao);
        goumaiziliaoService.updateById(goumaiziliao);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        goumaiziliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
