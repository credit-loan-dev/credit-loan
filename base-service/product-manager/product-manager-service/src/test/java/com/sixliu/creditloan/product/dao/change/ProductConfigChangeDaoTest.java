package com.sixliu.creditloan.product.dao.change;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.product.BaseTest;
import com.sixliu.creditloan.product.dao.ProductConfigDao;
import com.sixliu.creditloan.product.entity.ProductConfig;
import com.sixliu.creditloan.product.entity.change.ProductConfigChange;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年8月23日 下午8:53:30   
 * @version V1.0 
 * @Description:TODO
 */
public class ProductConfigChangeDaoTest extends BaseTest{

	@Autowired
	ProductConfigDao productConfigDao;
	
	@Autowired
	ProductConfigChangeDao productConfigChangeDao;

	@Test
	public void testInsert() {
		List<ProductConfig> result=productConfigDao.listAll();
		if(null!=result&&!result.isEmpty()) {
			ProductConfig productConfig=result.get(0);
			ProductConfigChange productConfigChange=new ProductConfigChange();
			BeanUtils.copyProperties(productConfig, productConfigChange);
			productConfigChange.setId(null);
			productConfigChange.setOriginalId(productConfig.getId());
			productConfigChangeDao.insert(productConfigChange);
		}
		checkOk(null);
	}

	@Test
	public void testGet() {
		String id="268fe6a5-a6d9-11e8-8df1-000c29851249";
		ProductConfigChange productConfig=productConfigChangeDao.get(id);
		checkOk(productConfig);
	}

	@Test
	public void testDelete() {
		String id="268fe6a5-a6d9-11e8-8df1-000c29851249";
		int result=productConfigChangeDao.delete(id);
		checkOk(result);
	}
}
