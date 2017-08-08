package com.vito16.shop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.vito16.shop.util.ResponseUtil;

/**
 * 
 * @author championjing@163.com
 *date 2017-08-08
 */
@Controller
@RequestMapping("/ping")
public class PingController {
	@RequestMapping(method = RequestMethod.GET)
	public void ping(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		JSONObject json = new JSONObject();
		json.put("version", "4.1");
		ResponseUtil.result(resp, json);
	}

}
