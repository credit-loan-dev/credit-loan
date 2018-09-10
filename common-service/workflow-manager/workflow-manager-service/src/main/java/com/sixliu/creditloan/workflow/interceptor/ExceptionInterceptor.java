package com.sixliu.creditloan.workflow.interceptor;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.workflow.exception.AppException;

import lombok.extern.slf4j.Slf4j;



/**
 * @author:MG01867
 * @date:2018年8月22日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Slf4j
@ControllerAdvice
public class ExceptionInterceptor {

	final static String SYSTEM_ERROR_MSG = "system error";

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public String handle(HttpServletResponse resp,Exception exception) {
		log.error(exception.getMessage(),exception);
		if (exception instanceof ValidationException) {
			resp.setStatus(HttpStatus.BAD_REQUEST.value());
			return exception.getMessage();
		} else if (exception instanceof AppException) {
			resp.setStatus(HttpStatus.BAD_REQUEST.value());
			return exception.getMessage();
		} else {
			resp.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			return SYSTEM_ERROR_MSG;
		}
	}
}
