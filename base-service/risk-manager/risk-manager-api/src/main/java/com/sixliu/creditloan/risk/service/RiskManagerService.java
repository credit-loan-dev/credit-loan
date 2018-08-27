package com.sixliu.creditloan.risk.service;

import com.sixliu.creditloan.risk.dto.RiskRequestDTO;
import com.sixliu.creditloan.risk.dto.RiskResultDTO;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年8月20日 下午7:25:37   
 * @version V1.0 
 * @Description:TODO
 */
public interface RiskManagerService {

	String applyKey();
	
	RiskResultDTO s(RiskRequestDTO riskRequest);
}
