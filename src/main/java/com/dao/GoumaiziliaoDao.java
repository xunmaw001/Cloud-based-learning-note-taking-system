package com.dao;

import com.entity.GoumaiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoumaiziliaoVO;
import com.entity.view.GoumaiziliaoView;


/**
 * 购买资料
 * 
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public interface GoumaiziliaoDao extends BaseMapper<GoumaiziliaoEntity> {
	
	List<GoumaiziliaoVO> selectListVO(@Param("ew") Wrapper<GoumaiziliaoEntity> wrapper);
	
	GoumaiziliaoVO selectVO(@Param("ew") Wrapper<GoumaiziliaoEntity> wrapper);
	
	List<GoumaiziliaoView> selectListView(@Param("ew") Wrapper<GoumaiziliaoEntity> wrapper);

	List<GoumaiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<GoumaiziliaoEntity> wrapper);
	
	GoumaiziliaoView selectView(@Param("ew") Wrapper<GoumaiziliaoEntity> wrapper);
	

}
