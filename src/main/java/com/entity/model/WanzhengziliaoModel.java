package com.entity.model;

import com.entity.WanzhengziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 完整资料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-20 09:51:08
 */
public class WanzhengziliaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资料名称
	 */
	
	private String ziliaomingcheng;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 完整资料
	 */
	
	private String wanzhengziliao;
		
	/**
	 * 发送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fasongshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：资料名称
	 */
	 
	public void setZiliaomingcheng(String ziliaomingcheng) {
		this.ziliaomingcheng = ziliaomingcheng;
	}
	
	/**
	 * 获取：资料名称
	 */
	public String getZiliaomingcheng() {
		return ziliaomingcheng;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：完整资料
	 */
	 
	public void setWanzhengziliao(String wanzhengziliao) {
		this.wanzhengziliao = wanzhengziliao;
	}
	
	/**
	 * 获取：完整资料
	 */
	public String getWanzhengziliao() {
		return wanzhengziliao;
	}
				
	
	/**
	 * 设置：发送时间
	 */
	 
	public void setFasongshijian(Date fasongshijian) {
		this.fasongshijian = fasongshijian;
	}
	
	/**
	 * 获取：发送时间
	 */
	public Date getFasongshijian() {
		return fasongshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
