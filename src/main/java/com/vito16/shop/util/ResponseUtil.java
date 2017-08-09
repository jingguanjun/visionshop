package com.vito16.shop.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

public class ResponseUtil {

	public static void result(HttpServletResponse resp,String content) throws IOException{
		PrintWriter pw = resp.getWriter();
		resp.setContentType("application/json;charset=utf-8");
		pw.write(content);
		pw.close();
	}

}
