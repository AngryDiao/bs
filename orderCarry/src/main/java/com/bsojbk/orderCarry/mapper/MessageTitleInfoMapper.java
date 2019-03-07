package com.bsojbk.orderCarry.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bsojbk.orderCarry.entity.MessageTitleInfo;

public interface MessageTitleInfoMapper {

	//查询所有
	@Select("SElECT * FROM MESSAGE_TITLE_INFO")
	List<MessageTitleInfo> findAllObjects();
	
	
}
