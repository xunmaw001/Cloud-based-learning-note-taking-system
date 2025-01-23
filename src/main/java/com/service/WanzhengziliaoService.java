package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WanzhengziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WanzhengziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WanzhengziliaoView;


/**
 * 完整资料
 *
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public interface WanzhengziliaoService extends IService<WanzhengziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WanzhengziliaoVO> selectListVO(Wrapper<WanzhengziliaoEntity> wrapper);
   	
   	WanzhengziliaoVO selectVO(@Param("ew") Wrapper<WanzhengziliaoEntity> wrapper);
   	
   	List<WanzhengziliaoView> selectListView(Wrapper<WanzhengziliaoEntity> wrapper);
   	
   	WanzhengziliaoView selectView(@Param("ew") Wrapper<WanzhengziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WanzhengziliaoEntity> wrapper);
   	

}

