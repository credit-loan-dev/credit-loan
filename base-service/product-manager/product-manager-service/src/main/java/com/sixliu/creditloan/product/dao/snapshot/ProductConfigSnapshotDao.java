package com.sixliu.creditloan.product.dao.snapshot;

import com.sixliu.creditloan.product.entity.snapshot.ProductConfigSnapshot;

/**
 * @author:MG01867
 * @date:2018年6月28日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品基础配置 快照 数据访问接口
 */
public interface ProductConfigSnapshotDao {

	ProductConfigSnapshot get(String id);

	int insert(ProductConfigSnapshot productConfigSnapshot);

	int delete(String id);
}
