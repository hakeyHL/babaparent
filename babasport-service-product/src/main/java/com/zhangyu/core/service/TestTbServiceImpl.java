/**
 * @Description TODO
 * @author ZhangYu
 * @date 上午11:13:32
 */
package com.zhangyu.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangyu.core.bean.TestTb;
import com.zhangyu.core.dao.TestTbDao;

/**
 * @author ZhangYu
 *
 */
@Service("testTbService")
@Transactional
public class TestTbServiceImpl implements TestTbService{

	@Autowired
	private TestTbDao testTbDao;
	
	@Override
	public void insertTestTb(TestTb testTb){
		testTbDao.insertTestTb(testTb);
		
//		throw new RuntimeException();
	}
}
