package com.bsojbk.orderCarry.entity;

import java.io.Serializable;

public class MessageTitleInfo extends EntityBase implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**消息标题ID*/
	private Long messageTitleId;
	/**消息标题内容*/
	private String messageTitle;
	/**用户ID*/
	private Long userId;
	
	
	public Long getMessageTitleId() {
		return messageTitleId;
	}
	public void setMessageTitleId(Long messageTitleId) {
		this.messageTitleId = messageTitleId;
	}
	public String getMessageTitle() {
		return messageTitle;
	}
	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	
}
