package com.sixliu.creditloan.credit.impl.service;

import java.util.List;

import com.sixliu.creditloan.credit.dao.OrderDao;
import com.sixliu.creditloan.credit.entity.CreditOrder;
import com.sixliu.creditloan.workflow.service.WorkflowRuntimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.credit.base.check.CreditApplyPreCheckManager;
import com.sixliu.creditloan.credit.component.CreditOrderIdGenerator;
import com.sixliu.creditloan.credit.dto.CreditApplyDTO;
import com.sixliu.creditloan.credit.service.CreditShopService;
import com.sixliu.creditloan.product.service.ProductForCreditLoanService;

/**
 * @author:MG01867
 * @date: 2018年8月6日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CreditShopServiceImpl implements CreditShopService {

    private final ProductForCreditLoanService productManagerClient;

    private final CreditApplyPreCheckManager creditApplyPreCheckManager;

    private final CreditOrderIdGenerator creditOrderIdGenerator;

    private final OrderDao orderDao;

    private final WorkflowRuntimeService workflowRuntimeService;

    @Override
    public String apply(CreditApplyDTO creditApplyDTO) {
        creditApplyPreCheckManager.check(creditApplyDTO);
        String productSnapshotId = productManagerClient.generateProductSnapshot(creditApplyDTO.getProductId());
        String id = creditOrderIdGenerator.generator(creditApplyDTO.getProductId());
        String flowJobId = workflowRuntimeService.createJob(creditApplyDTO.getProductId(),creditApplyDTO.getInputUserId());
        CreditOrder creditOrder = new CreditOrder();
        creditOrder.setId(id);
        creditOrder.setCustomerId(creditApplyDTO.getCustomerId());
        creditOrder.setProductId(creditApplyDTO.getProductId());
        creditOrder.setProductSnapshotId(productSnapshotId);
        creditOrder.setFlowJobId(flowJobId);
        creditOrder.setApplyCreditlimit(creditApplyDTO.getApplyCreditlimit());
        creditOrder.setApplyLoanTermType(creditApplyDTO.getApplyLoanTermType());
        creditOrder.setApplyLoanTerm(creditApplyDTO.getApplyLoanTerm());
        creditOrder.setReferenceId(creditApplyDTO.getReferenceId());
        creditOrder.setChannelId(creditApplyDTO.getChannelId());
        creditOrder.setActivityId(creditApplyDTO.getActivityId());
        creditOrder.setChannelId(creditApplyDTO.getChannelId());
        creditOrder.setReferenceId(creditApplyDTO.getReferenceId());
        creditOrder.setCreateUserId(creditApplyDTO.getInputUserId());
        orderDao.insert(creditOrder);
        return creditOrder.getId();
    }

    @Override
    public List<String> listByCustomerid(String customerId) {
        return null;
    }
}
