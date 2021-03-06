package com.wechat.tuling;

import net.sf.json.JSONObject;

/**
 * 图灵机器人接口流程控制类
 * @author pamchen-1
 *
 */
public class TulingController {
	/**
	 * 调用图灵机器人接口，并返回所需内容
	 * @param info
	 * @return
	 */
	public String getTulingRe(String info){
		//调用图灵机器人接口api，获取结果
		String url = "http://www.tuling123.com/openapi/api?key=f42e5b9ea9c64173b98c6cbffd377313&info="+info;
		String tlResult = HttpGetRequest.get(url);
		
		//解析图灵结果数据，提取所需内容
		JSONObject json = JSONObject.fromObject(tlResult);
		tlResult = json.getString("text");
		
		return tlResult;
		
	}
}
