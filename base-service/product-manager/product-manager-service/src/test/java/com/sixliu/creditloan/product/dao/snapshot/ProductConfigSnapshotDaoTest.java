package com.sixliu.creditloan.product.dao.snapshot;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.dao.ProductConfigDao;
import com.sixliu.creditloan.product.entity.ProductConfig;
import com.sixliu.creditloan.product.entity.snapshot.ProductConfigSnapshot;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年8月23日 下午8:53:30   
 * @version V1.0 
 * @Description:TODO
 */
public class ProductConfigSnapshotDaoTest extends BaseTest{

	@Autowired
	ProductConfigDao productConfigDao;
	
	@Autowired
	ProductConfigSnapshotDao productConfigSnapshotDao;

	@Test
	public void testInsert() {
		List<ProductConfig> result=productConfigDao.listAll();
		if(null!=result&&!result.isEmpty()) {
			ProductConfig productConfig=result.get(0);
			ProductConfigSnapshot productConfigChange=new ProductConfigSnapshot();
			BeanUtils.copyProperties(productConfig, productConfigChange);
			productConfigChange.setId(null);
			productConfigChange.setOriginalId(productConfig.getId());
			productConfigSnapshotDao.insert(productConfigChange);
		}
		checkOk(null);
	}

	@Test
	public void testGet() {
		String id="16c68e79-a6db-11e8-8df1-000c29851249";
		ProductConfigSnapshot result=productConfigSnapshotDao.get(id);
		checkOk(result);
	}

	@Test
	public void testDelete() {
		String id="16c68e79-a6db-11e8-8df1-000c29851249";
		int result=productConfigSnapshotDao.delete(id);
		checkOk(result);
	}
}
