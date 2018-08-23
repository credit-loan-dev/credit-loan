package com.sixliu.creditloan.credit.base;

import java.util.Map;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

import com.sixliu.credit.common.dto.BaseWriteDTO;
import com.sixliu.credit.common.validation.LoanAmountValidation;
import com.sixliu.creditloan.product.validation.LoanTermTypeValidation;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年8月20日 下午11:01:13   
 * @version V1.0 
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CreditOrderDTO extends BaseWriteDTO{


	/**客户id**/
	@NotBlank(message = "the customerId must not be blank")
	private String customerId;
	
	/**产品id**/
	@NotBlank(message = "the productId must not be blank")
	private String productId;
	
	/**申请申请授信额度**/
	@LoanAmountValidation(message="the applyLoanAmount is illegal")
	private Double applyCreditlimit;
	
	/**申请贷款期限类型**/
	@LoanTermTypeValidation(message="the applyLoanTermType is illegal")
	private Integer applyLoanTermType;
	
	/**申请贷款期限**/
	@DecimalMin(value="0")
	private Integer applyLoanTerm;
	
	/**推荐人id**/
	private String referenceId;
	
	/**参与活动id**/
	private String activityId;
	
	/**数据录入userid**/
	private String inputUserId;
	
	/**申请渠道**/
	private String channelId;
	
	/**扩展表单**/
	private Map<String,Object> extendForm;
}