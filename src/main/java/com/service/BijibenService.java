package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BijibenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BijibenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BijibenView;


/**
 * 笔记本
 *
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public interface BijibenService extends IService<BijibenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BijibenVO> selectListVO(Wrapper<BijibenEntity> wrapper);
   	
   	BijibenVO selectVO(@Param("ew") Wrapper<BijibenEntity> wrapper);
   	
   	List<BijibenView> selectListView(Wrapper<BijibenEntity> wrapper);
   	
   	BijibenView selectView(@Param("ew") Wrapper<BijibenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BijibenEntity> wrapper);
   	

}

