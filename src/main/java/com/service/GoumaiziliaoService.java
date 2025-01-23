package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaiziliaoView;


/**
 * 购买资料
 *
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public interface GoumaiziliaoService extends IService<GoumaiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaiziliaoVO> selectListVO(Wrapper<GoumaiziliaoEntity> wrapper);
   	
   	GoumaiziliaoVO selectVO(@Param("ew") Wrapper<GoumaiziliaoEntity> wrapper);
   	
   	List<GoumaiziliaoView> selectListView(Wrapper<GoumaiziliaoEntity> wrapper);
   	
   	GoumaiziliaoView selectView(@Param("ew") Wrapper<GoumaiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaiziliaoEntity> wrapper);
   	

}

