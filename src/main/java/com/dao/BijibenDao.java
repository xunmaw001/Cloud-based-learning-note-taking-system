package com.dao;

import com.entity.BijibenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BijibenVO;
import com.entity.view.BijibenView;


/**
 * 笔记本
 * 
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public interface BijibenDao extends BaseMapper<BijibenEntity> {
	
	List<BijibenVO> selectListVO(@Param("ew") Wrapper<BijibenEntity> wrapper);
	
	BijibenVO selectVO(@Param("ew") Wrapper<BijibenEntity> wrapper);
	
	List<BijibenView> selectListView(@Param("ew") Wrapper<BijibenEntity> wrapper);

	List<BijibenView> selectListView(Pagination page,@Param("ew") Wrapper<BijibenEntity> wrapper);
	
	BijibenView selectView(@Param("ew") Wrapper<BijibenEntity> wrapper);
	

}
