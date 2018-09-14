package com.sixliu.creditloan.product.entity.loan;



import com.sixliu.creditloan.product.constant.InterestCycle;
import com.sixliu.creditloan.product.constant.LoanTermType;
import com.sixliu.creditloan.product.constant.RepaymentStrategy;
import com.sixliu.creditloan.product.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年7月30日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 贷款-定价配置
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class LoanPriceConfig extends BaseEntity {

	/** 定价名称**/
	private String name;
	
	/**产品id**/
	private String productId;
	
	/** 还款策略**/
	private RepaymentStrategy repaymentStrategy;
	
	/** 最小单笔贷款金额:VARCHAR(20) **/
	private Double minSingleLoanAmount;

	/** 最大单笔贷款金额:VARCHAR(20) **/
	private Double maxSingleLoanAmount;

	/** 单笔贷款期限类型:INT(1) **/
	private LoanTermType loanTermType;

	/** 最小单笔贷款期限(数量):INT(3) **/
	private Integer minSingleLoanTerm;

	/** 最大单笔贷款期限(数量):INT(3) **/
	private Integer maxSingleLoanTerm;
	
	/** 手续费率**/
	private Double poundageRate;
	
	/** 计息周期**/
	private InterestCycle interestCycle;
	
	//正常还款配置
	/**正常利率**/
	private Double interestRateForDay;
	
	private Double interestRateForMonth;
	
	private Double interestRateForYear;
	
	//合作配置
	/**开启合作**/
	private Boolean partnerEnable;
	
	/**合作伙伴id**/
	private String partnerId;
	
	/**贴息利率**/
	private Double partnerDiscountChargesRateForDay;
	
	private Double partnerDiscountChargesRateForMonth;
	
	private Double partnerDiscountChargesRateForYear;
	
	//展期配置
	/**开启展期**/
	private Boolean loanExtensionEnable;
	
	/**最大展期次数**/
	private Integer loanExtensionMaxCount;
	
	/**最大展期累计期数**/
	private Integer loanExtensionMaxTotalTerm;
	
	/**最大展期期数**/
	private Integer loanExtensionMaxTerm;
	
	/**展期利率**/
	private Double loanExtensionInterestRateForDay;
	
	private Double loanExtensionInterestRateForMonth;
	
	private Double loanExtensionInterestRateForYear;
	
	//逾期还款配置
	/**开启逾期**/
	private Boolean loanOverdueEnable;
	
	/**最大逾期次数**/
	private Integer loanOverdueMaxCount;
	
	/**最大逾期累计期数**/
	private Integer loanOverdueMaxTotalTerm;
	
	/**最大逾期期数**/
	private Integer loanOverdueMaxTerm;
	
	/**逾期还款利率**/
	private Double loanOverdueInterestRateForDay;
	
	private Double loanOverdueInterestRateForMonth;
	
	private Double loanOverdueInterestRateForYear;
	
	//提前还款配置
	/**开启提前还款**/
	private Boolean earlyRepaymentEnable;
	
	/**提前还款利率期限**/
	private Double earlyRepaymentInterestRate;
	
}
