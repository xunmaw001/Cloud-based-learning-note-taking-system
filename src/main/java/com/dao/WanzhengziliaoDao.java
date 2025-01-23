package com.dao;

import com.entity.WanzhengziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WanzhengziliaoVO;
import com.entity.view.WanzhengziliaoView;


/**
 * 完整资料
 * 
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public interface WanzhengziliaoDao extends BaseMapper<WanzhengziliaoEntity> {
	
	List<WanzhengziliaoVO> selectListVO(@Param("ew") Wrapper<WanzhengziliaoEntity> wrapper);
	
	WanzhengziliaoVO selectVO(@Param("ew") Wrapper<WanzhengziliaoEntity> wrapper);
	
	List<WanzhengziliaoView> selectListView(@Param("ew") Wrapper<WanzhengziliaoEntity> wrapper);

	List<WanzhengziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<WanzhengziliaoEntity> wrapper);
	
	WanzhengziliaoView selectView(@Param("ew") Wrapper<WanzhengziliaoEntity> wrapper);
	

}
