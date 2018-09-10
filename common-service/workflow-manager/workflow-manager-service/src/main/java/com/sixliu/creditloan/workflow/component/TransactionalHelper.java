package com.sixliu.creditloan.workflow.component;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月10日 下午11:49:29   
 * @version V1.0 
 * @Description:TODO
 */
@Component
public class TransactionalHelper {

	@Transactional
	public <R>R doSomething(DoSomething<R> doSomething){
		return doSomething.doSomething();
	}
	
	@FunctionalInterface
	public interface DoSomething<R>{
		R doSomething();
	}
}
