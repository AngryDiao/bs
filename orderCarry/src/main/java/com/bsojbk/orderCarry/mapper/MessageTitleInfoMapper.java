package com.bsojbk.orderCarry.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bsojbk.orderCarry.entity.MessageTitleInfo;

public interface MessageTitleInfoMapper {

	//查询所有
	@Select("select * from message_title_info")
	List<MessageTitleInfo> findAllObject();
	
	
	//新增
	@Insert("insert into message_title_info (message_title,user_id) values(#{messageTitle},#{userId})")
	public void insert(MessageTitleInfo messageTitleInfo) ;
	
}
