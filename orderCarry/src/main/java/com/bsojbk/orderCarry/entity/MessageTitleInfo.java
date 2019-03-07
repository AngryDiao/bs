package com.bsojbk.orderCarry.entity;

import java.io.Serializable;

public class MessageTitleInfo extends EntityBase implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**消息标题ID*/
	private Long messageTitleId;
	/**消息标题内容*/
	private Long messageTitle;
	/**用户ID*/
	private Long userId;
	
	
	public Long getMessageTitleId() {
		return messageTitleId;
	}
	public void setMessageTitleId(Long messageTitleId) {
		this.messageTitleId = messageTitleId;
	}
	public Long getMessageTitle() {
		return messageTitle;
	}
	public void setMessageTitle(Long messageTitle) {
		this.messageTitle = messageTitle;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "MessageTitleInfo [messageTitleId=" + messageTitleId + ", messageTitle=" + messageTitle + ", userId="
				+ userId + ", createTime=" + createTime + ", modifyTime=" + modifyTime + "]";
	}
	
	
	
	
}
