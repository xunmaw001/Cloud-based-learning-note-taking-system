package com.entity.view;

import com.entity.WanzhengziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 完整资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
@TableName("wanzhengziliao")
public class WanzhengziliaoView  extends WanzhengziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WanzhengziliaoView(){
	}
 
 	public WanzhengziliaoView(WanzhengziliaoEntity wanzhengziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, wanzhengziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
