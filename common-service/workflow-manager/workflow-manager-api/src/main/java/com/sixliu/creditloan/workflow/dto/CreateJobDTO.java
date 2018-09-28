package com.sixliu.creditloan.workflow.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * @author: MG01867
 * @date: 2018/9/28
 * @email: 359852326@qq.com
 * @version:
 * @describe 创建流程job dto
 */
@Data
public class CreateJobDTO {

    @NotBlank
    private String modelId;

    @NotBlank
    private String createUserId;

    private Map<String, Object> extensionParameterMap;
}
