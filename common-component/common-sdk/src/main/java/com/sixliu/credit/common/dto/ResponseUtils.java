package com.sixliu.credit.common.dto;


/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年6月15日 下午9:05:23
 * @version V1.0
 * @Description:TODO
 */

public class ResponseUtils {

	public final static int SUCCEED_CODE = 1;

	public static <T> Response<T> succeed() {
		Response<T> response = new Response<T>();
		response.setCode(SUCCEED_CODE);
		return response;
	}

	public static <T> Response<T> succeed(T data) {
		Response<T> response = new Response<T>();
		response.setCode(SUCCEED_CODE);
		response.setResult(data);
		return response;
	}

	public static <T> Response<T> failed(int code) {
		checkfailedCode(code);
		Response<T> response = new Response<T>();
		response.setCode(code);
		return response;
	}

	public static <T> Response<T> failed(int code, String message) {
		checkfailedCode(code);
		Response<T> response = new Response<T>();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}

	private static void checkfailedCode(int code) {
		if (SUCCEED_CODE == code) {
			throw new IllegalArgumentException(String.format("the faild code[%s] is illegal", code));
		}
	}
}
