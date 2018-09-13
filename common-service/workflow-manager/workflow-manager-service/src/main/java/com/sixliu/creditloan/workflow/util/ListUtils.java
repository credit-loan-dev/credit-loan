package com.sixliu.creditloan.workflow.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.NonNull;

/**
 * @author:MG01867
 * @date:2018年9月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class ListUtils {

	/**
	 * 转换器
	 * 
	 * @author MG01867
	 *
	 * @param <S> 原始对象实例类型
	 * @param <R> 新的对象实例类型
	 */
	public interface Converter<S, R> {
		R process(S object);
	}

	/**
	 * 将原始数据集合转换成新的数据集合
	 * 如果source为null或者空，那么返回空集合
	 * @param source    原始数据集合
	 * @param converter 数据转换器
	 * @return 
	 */
	public static <S, R> List<R> convert(List<S> source,@NonNull Converter<S, R> converter) {
		if (null == source || source.isEmpty()) {
			return Collections.emptyList();
		} else {
			List<R> result = new ArrayList<>(source.size());
			for (S item : source) {
				R newObject = converter.process(item);
				result.add(newObject);
			}
			return result;
		}
	}
}
