package com.bsojbk.orderCarry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsojbk.orderCarry.entity.MessageTitleInfo;
import com.bsojbk.orderCarry.service.MessageTitleInfoService;

@RestController
@RequestMapping("/messageTitle/")
public class MessageTitleInfoController {

	@Autowired
	MessageTitleInfoService messageTitleInfoService;
	
	
	@RequestMapping("findAllObject")
	public List<MessageTitleInfo> findAllObject(){
		
		return messageTitleInfoService.findAllObject();
	}
	
	@RequestMapping("test")
	public String test() {
		
		return "hello";
				
	}
	@RequestMapping("insert/{messageTitle}/{userId}")
	public String  insert(MessageTitleInfo messageTitleInfo) {

		try {
			messageTitleInfoService.insert(messageTitleInfo);
			return "insert success";
		} catch (Exception e) {
			e.printStackTrace();
			return "insert error";
					
		}
	}
	
}
