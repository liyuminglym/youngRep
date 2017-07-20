package com.liyuming.movie.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class movieService {

	@Resource
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@RequestMapping(value="/queryMovie",method ={RequestMethod.GET,RequestMethod.POST})
   public Object queryMovie(HttpServletRequest request){
	       System.out.println("id="+request.getParameter("id"));
		   Map<String,Object> resultMap = new HashMap<>();
		   /*   resultMap.put("movie", new Movie("lala",100));*/
		   Map<String,String> paramMap = new HashMap<>();
		   paramMap.put("id", request.getParameter("id"));
		   Map<String,Object> resultMap2 = restTemplate.getForObject("http://localhost:8989/queryUser", Map.class, paramMap);
	        return resultMap2;
   }
}
