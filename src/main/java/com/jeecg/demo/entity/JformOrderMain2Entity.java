package com.jeecg.demo.entity;

import org.hibernate.annotations.GenericGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

import javax.persistence.*;
import java.util.Date;

/**   
 * @Title: Entity
 * @Description: 订单主信息
 * @author onlineGenerator
 * @date 2018-03-27 16:21:58
 * @version V1.0   
 *
 */
@Entity
@Table(name = "jform_order_main", schema = "")
@SuppressWarnings("serial")
public class JformOrderMain2Entity implements java.io.Serializable {
	/**主键*/
	private String id;
	/**订单号*/
    @Excel(name="订单号",width=15)
	private String orderCode;
	/**订单日期*/
    @Excel(name="订单日期",width=15,format = "yyyy-MM-dd")
	private Date orderDate;
	/**订单金额*/
    @Excel(name="订单金额",width=15)
	private Double orderMoney;
	/**备注*/
    @Excel(name="备注",width=15)
	private String content;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	
	@Column(name ="ID",nullable=false,length=36)
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单号
	 */
	
	@Column(name ="ORDER_CODE",nullable=true,length=50)
	public String getOrderCode(){
		return this.orderCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单号
	 */
	public void setOrderCode(String orderCode){
		this.orderCode = orderCode;
	}
	
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  订单日期
	 */
	
	@Column(name ="ORDER_DATE",nullable=true,length=20)
	public Date getOrderDate(){
		return this.orderDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  订单日期
	 */
	public void setOrderDate(Date orderDate){
		this.orderDate = orderDate;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  订单金额
	 */
	
	@Column(name ="ORDER_MONEY",nullable=true,scale=3,length=10)
	public Double getOrderMoney(){
		return this.orderMoney;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  订单金额
	 */
	public void setOrderMoney(Double orderMoney){
		this.orderMoney = orderMoney;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	
	@Column(name ="CONTENT",nullable=true,length=255)
	public String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setContent(String content){
		this.content = content;
	}
	
}
