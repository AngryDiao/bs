package com.bsojbk.orderCarry.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserInfo extends EntityBase implements Serializable{
	
	
	
	
	private static final long serialVersionUID = 1L;
	
	/** 学校 */
	private String userSchool;
	/** 学号 */
	private Long userNum;
	/** 电话号 */
	private Long userTel;
	/** 账户金额 */
	private BigDecimal userMoney;
	/** 订单ID */
	private Long orderId;
	/** 消息详情ID */
	private String messageDetailsId;
	
	
	
	/** 发布ID */
	private Long userId;
	/** 接单ID */
	private Long userCarryId;
	/** 用户名 */
	private String userName;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getUserCarryId() {
		return userCarryId;
	}
	public void setUserCarryId(Long userCarryId) {
		this.userCarryId = userCarryId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSchool() {
		return userSchool;
	}
	public void setUserSchool(String userSchool) {
		this.userSchool = userSchool;
	}
	public Long getUserNum() {
		return userNum;
	}
	public void setUserNum(Long userNum) {
		this.userNum = userNum;
	}
	public Long getUserTel() {
		return userTel;
	}
	public void setUserTel(Long userTel) {
		this.userTel = userTel;
	}
	public BigDecimal getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(BigDecimal userMoney) {
		this.userMoney = userMoney;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getMessageDetailsId() {
		return messageDetailsId;
	}
	public void setMessageDetailsId(String messageDetailsId) {
		this.messageDetailsId = messageDetailsId;
	}
	
	
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userCarryId=" + userCarryId + ", userName=" + userName
				+ ", userSchool=" + userSchool + ", userNum=" + userNum + ", userTel=" + userTel + ", userMoney="
				+ userMoney + ", orderId=" + orderId + ", messageDetailsId=" + messageDetailsId + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + "]";
	}
}
