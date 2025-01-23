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


import com.dao.BijibenDao;
import com.entity.BijibenEntity;
import com.service.BijibenService;
import com.entity.vo.BijibenVO;
import com.entity.view.BijibenView;

@Service("bijibenService")
public class BijibenServiceImpl extends ServiceImpl<BijibenDao, BijibenEntity> implements BijibenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BijibenEntity> page = this.selectPage(
                new Query<BijibenEntity>(params).getPage(),
                new EntityWrapper<BijibenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BijibenEntity> wrapper) {
		  Page<BijibenView> page =new Query<BijibenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BijibenVO> selectListVO(Wrapper<BijibenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BijibenVO selectVO(Wrapper<BijibenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BijibenView> selectListView(Wrapper<BijibenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BijibenView selectView(Wrapper<BijibenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
