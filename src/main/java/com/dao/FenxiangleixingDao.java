package com.dao;

import com.entity.FenxiangleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenxiangleixingVO;
import com.entity.view.FenxiangleixingView;


/**
 * 分享类型
 * 
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public interface FenxiangleixingDao extends BaseMapper<FenxiangleixingEntity> {
	
	List<FenxiangleixingVO> selectListVO(@Param("ew") Wrapper<FenxiangleixingEntity> wrapper);
	
	FenxiangleixingVO selectVO(@Param("ew") Wrapper<FenxiangleixingEntity> wrapper);
	
	List<FenxiangleixingView> selectListView(@Param("ew") Wrapper<FenxiangleixingEntity> wrapper);

	List<FenxiangleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FenxiangleixingEntity> wrapper);
	
	FenxiangleixingView selectView(@Param("ew") Wrapper<FenxiangleixingEntity> wrapper);
	

}
