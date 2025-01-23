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

import com.entity.WanzhengziliaoEntity;
import com.entity.view.WanzhengziliaoView;

import com.service.WanzhengziliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 完整资料
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
@RestController
@RequestMapping("/wanzhengziliao")
public class WanzhengziliaoController {
    @Autowired
    private WanzhengziliaoService wanzhengziliaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WanzhengziliaoEntity wanzhengziliao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wanzhengziliao.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WanzhengziliaoEntity> ew = new EntityWrapper<WanzhengziliaoEntity>();


		PageUtils page = wanzhengziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanzhengziliao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WanzhengziliaoEntity wanzhengziliao, 
		HttpServletRequest request){
        EntityWrapper<WanzhengziliaoEntity> ew = new EntityWrapper<WanzhengziliaoEntity>();

		PageUtils page = wanzhengziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wanzhengziliao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WanzhengziliaoEntity wanzhengziliao){
       	EntityWrapper<WanzhengziliaoEntity> ew = new EntityWrapper<WanzhengziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wanzhengziliao, "wanzhengziliao")); 
        return R.ok().put("data", wanzhengziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WanzhengziliaoEntity wanzhengziliao){
        EntityWrapper< WanzhengziliaoEntity> ew = new EntityWrapper< WanzhengziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wanzhengziliao, "wanzhengziliao")); 
		WanzhengziliaoView wanzhengziliaoView =  wanzhengziliaoService.selectView(ew);
		return R.ok("查询完整资料成功").put("data", wanzhengziliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WanzhengziliaoEntity wanzhengziliao = wanzhengziliaoService.selectById(id);
        return R.ok().put("data", wanzhengziliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WanzhengziliaoEntity wanzhengziliao = wanzhengziliaoService.selectById(id);
        return R.ok().put("data", wanzhengziliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WanzhengziliaoEntity wanzhengziliao, HttpServletRequest request){
    	wanzhengziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanzhengziliao);

        wanzhengziliaoService.insert(wanzhengziliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody WanzhengziliaoEntity wanzhengziliao, HttpServletRequest request){
    	wanzhengziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wanzhengziliao);

        wanzhengziliaoService.insert(wanzhengziliao);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WanzhengziliaoEntity wanzhengziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wanzhengziliao);
        wanzhengziliaoService.updateById(wanzhengziliao);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wanzhengziliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
