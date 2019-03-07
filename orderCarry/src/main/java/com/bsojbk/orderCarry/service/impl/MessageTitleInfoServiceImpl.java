package com.bsojbk.orderCarry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsojbk.orderCarry.entity.MessageTitleInfo;
import com.bsojbk.orderCarry.mapper.MessageTitleInfoMapper;
import com.bsojbk.orderCarry.service.MessageTitleInfoService;

@Service
public class MessageTitleInfoServiceImpl implements MessageTitleInfoService{

	@Autowired
	MessageTitleInfoMapper messageTitleInfoMapper;
	
	public List<MessageTitleInfo> findAllObject(){
		return messageTitleInfoMapper.findAllObject();
	}
	
	public void insert(MessageTitleInfo messageTitleInfo) {
		messageTitleInfoMapper.insert(messageTitleInfo);
	}
}
