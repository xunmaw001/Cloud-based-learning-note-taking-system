package com.entity.view;

import com.entity.GoumaiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 购买资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
@TableName("goumaiziliao")
public class GoumaiziliaoView  extends GoumaiziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GoumaiziliaoView(){
	}
 
 	public GoumaiziliaoView(GoumaiziliaoEntity goumaiziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, goumaiziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
