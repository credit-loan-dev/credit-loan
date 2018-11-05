package com.sixliu.user.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sixliu.user.constant.FormatPatternsForDateTime;
import com.sixliu.user.validation.AddValidationGroup;
import com.sixliu.user.validation.CurrentUserValidation;
import com.sixliu.user.validation.UpdateValidationGroup;

import lombok.Data;

/**
 * @author:MG01867
 * @date:2018年11月5日
 * @email:359852326@qq.com
 * @version:
 * @describe 基础dto
 */
@Data
public abstract class BaseDTO {

	/** 数据id业务无关性 **/
	@NotBlank(message = "The id must be not blank", groups = { UpdateValidationGroup.class })
	private String id;

	/** 数据版本 **/
	private int version;

	/** 数据更新用户 **/
	@CurrentUserValidation(message = "The updateUserId is illegal", groups = { UpdateValidationGroup.class })
	private String updateUserId;

	/** 数据更新日期 **/
	@JsonFormat(pattern = FormatPatternsForDateTime.DATE_TIME_FOR_COMMON)
	@DateTimeFormat(pattern = FormatPatternsForDateTime.DATE_TIME_FOR_COMMON)
	private Date updateDate;

	/** 数据创建用户 **/
	@CurrentUserValidation(message = "The createUser is illegal", groups = { AddValidationGroup.class })
	private String createUserId;

	/** 数据创建日期 **/
	@JsonFormat(pattern = FormatPatternsForDateTime.DATE_TIME_FOR_COMMON)
	@DateTimeFormat(pattern = FormatPatternsForDateTime.DATE_TIME_FOR_COMMON)
	private Date createDate;
}
