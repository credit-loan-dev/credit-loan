package com.sixliu.user.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

/**
 * @author:MG01867
 * @date:2018年11月5日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class Convertor {

	@FunctionalInterface
	public interface Creator<T> {
		T create();
	}

	/**
	 * 单个数据转换
	 * @param source
	 * @param creator
	 * @return
	 */
	public static <Source, T> T convert(Source source, Creator<T> creator) {
		T result = null;
		if (null != source) {
			result = creator.create();
			BeanUtils.copyProperties(source, result);
		}
		return result;
	}

	/**
	 * 多个数据转换
	 * @param sources
	 * @param creator
	 * @return
	 */
	public static <Source, T> List<T> convert(List<Source> sources, Creator<T> creator) {
		List<T> result = null;
		if (null != sources) {
			result = new ArrayList<>(sources.size());
			T temp = null;
			for (Source source : sources) {
				temp =convert(source, creator);
				result.add(temp);
			}
		}
		return result;
	}
}
