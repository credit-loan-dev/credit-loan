package com.sixliu.user.dto;

/**
*@author:MG01867
*@date:2018年11月5日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public class Response<T>{

	/** 通用响应码 **/
	public static final class Code {
		/** 成功 **/
		public static final String SUCCEED = "SUCCEED";

		/** 失败 **/
		public static final String FAILED = "FAILED";

		/** 无效参数 **/
		public static final String ILLEGAL_PARAMETER = "INVALID_PARAMETER";

		/** 无效操作 **/
		public static final String ILLEGAL_OPERATION = "INVALID_OPERATION";

		/** 无效权限 **/
		public static final String ILLEGAL_AUTHORITY = "INVALID_AUTHORITY";

		/** 请求重复 **/
		public static final String REQUEST_DUPLICATE = "REQUEST_DUPLICATE";

		/** 系统异常 **/
		public static final String SYSTEM_ERROR = "SYSTEM_ERROR";
	}

	// SUCCEED
	private String code;
	private String msg;
	private T result;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public static <T> Response<T> success(T result) {
		Response<T> response = new Response<>();
		response.setCode(Code.SUCCEED);
		response.setResult(result);
		return response;
	}

	public static <T> Response<T> failForIllegalParameter(String msg) {
		Response<T> response = new Response<>();
		response.setCode(Code.ILLEGAL_PARAMETER);
		response.setMsg(msg);
		return response;
	}
	
	public static <T> Response<T> failForCommonIllegalParameter(String name) {
		Response<T> response = new Response<>();
		response.setCode(Code.ILLEGAL_PARAMETER);
		response.setMsg(String.format("The Parameter[%s] is illegal",name));
		return response;
	}

	public static <T> Response<T> failForIllegalOperation(String msg) {
		Response<T> response = new Response<>();
		response.setCode(Code.ILLEGAL_OPERATION);
		response.setMsg(msg);
		return response;
	}

	public static <T> Response<T> failForIllegalAuthority(String msg) {
		Response<T> response = new Response<>();
		response.setCode(Code.ILLEGAL_AUTHORITY);
		response.setMsg(msg);
		return response;
	}

	public static <T> Response<T> failForRequestDuplicate(String msg) {
		Response<T> response = new Response<>();
		response.setCode(Code.REQUEST_DUPLICATE);
		response.setMsg(msg);
		return response;
	}

	public static <T> Response<T> failForSystemError(String msg) {
		Response<T> response = new Response<>();
		response.setCode(Code.SYSTEM_ERROR);
		response.setMsg(msg);
		return response;
	}
}
