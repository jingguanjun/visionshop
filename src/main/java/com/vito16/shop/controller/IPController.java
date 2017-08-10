package com.vito16.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IPController {

	@RequestMapping("/getRegion")
	public void getRegion(HttpServletRequest req, HttpServletResponse resp){
		req.getRemoteAddr();
	}
}
