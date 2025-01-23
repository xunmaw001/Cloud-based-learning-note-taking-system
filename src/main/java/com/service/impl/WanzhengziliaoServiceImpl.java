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


import com.dao.WanzhengziliaoDao;
import com.entity.WanzhengziliaoEntity;
import com.service.WanzhengziliaoService;
import com.entity.vo.WanzhengziliaoVO;
import com.entity.view.WanzhengziliaoView;

@Service("wanzhengziliaoService")
public class WanzhengziliaoServiceImpl extends ServiceImpl<WanzhengziliaoDao, WanzhengziliaoEntity> implements WanzhengziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WanzhengziliaoEntity> page = this.selectPage(
                new Query<WanzhengziliaoEntity>(params).getPage(),
                new EntityWrapper<WanzhengziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WanzhengziliaoEntity> wrapper) {
		  Page<WanzhengziliaoView> page =new Query<WanzhengziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WanzhengziliaoVO> selectListVO(Wrapper<WanzhengziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WanzhengziliaoVO selectVO(Wrapper<WanzhengziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WanzhengziliaoView> selectListView(Wrapper<WanzhengziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WanzhengziliaoView selectView(Wrapper<WanzhengziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
