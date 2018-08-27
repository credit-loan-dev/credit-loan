package com.sixliu.creditloan.product.interceptor;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年8月25日 上午1:07:47   
 * @version V1.0 
 * @Description:TODO
 */
public class TraceHandlerInterceptor implements HandlerInterceptor{

	private final static String TRACE_ID="trace-id";
	private final static String SPAN_INDEX="span";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String traceId=request.getHeader(TRACE_ID);
		if(null==traceId) {
			traceId=UUID.randomUUID().toString();
			request.setAttribute(TRACE_ID, traceId);
			request.setAttribute(SPAN_INDEX, 0);
		}
		return true;
	}
}
