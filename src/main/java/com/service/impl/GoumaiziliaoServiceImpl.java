package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GoumaiziliaoDao;
import com.entity.GoumaiziliaoEntity;
import com.service.GoumaiziliaoService;
import com.entity.vo.GoumaiziliaoVO;
import com.entity.view.GoumaiziliaoView;

@Service("goumaiziliaoService")
public class GoumaiziliaoServiceImpl extends ServiceImpl<GoumaiziliaoDao, GoumaiziliaoEntity> implements GoumaiziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaiziliaoEntity> page = this.selectPage(
                new Query<GoumaiziliaoEntity>(params).getPage(),
                new EntityWrapper<GoumaiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaiziliaoEntity> wrapper) {
		  Page<GoumaiziliaoView> page =new Query<GoumaiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaiziliaoVO> selectListVO(Wrapper<GoumaiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaiziliaoVO selectVO(Wrapper<GoumaiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaiziliaoView> selectListView(Wrapper<GoumaiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaiziliaoView selectView(Wrapper<GoumaiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
