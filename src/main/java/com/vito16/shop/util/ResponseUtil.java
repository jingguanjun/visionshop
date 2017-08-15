package com.vito16.shop.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

public class ResponseUtil {

	public static void result(HttpServletResponse response,String content) throws IOException{
		PrintWriter pw = response.getWriter();
		response.setContentType("application/json;charset=utf-8");
		pw.write(content);
		pw.close();
	}

}
