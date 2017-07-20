package com.liyuming.user.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liyuming.user.user.dto.User;

@RestController
public class UserController {

	
	@RequestMapping(value="/queryUser")
	public Object queryUser(HttpServletRequest request){
		System.out.println(request.getParameter("id"));
		Map<String,Object> resultMap = new HashMap<>();
		User user = new User("123123", "liyuming");
		resultMap.put("user", user);
		return resultMap;
	}
}
