/**
 * @Description TODO
 * @author ZhangYu
 * @date 下午5:55:20
 */
package com.zhangyu;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangyu.core.bean.TestTb;
import com.zhangyu.core.dao.TestTbDao;
import com.zhangyu.core.service.TestTbService;

/**
 * @author ZhangYu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTbTest {

	@Autowired
//	private TestTbDao testTbDao;
	private TestTbService testTbService;
	
	@Test
	public void TestAdd(){
		TestTb testTb = new TestTb();
		testTb.setName("张瑀2");
		testTb.setBirthday(new Date());
		
//		testTbDao.insertTestTb(testTb);
		testTbService.insertTestTb(testTb);
	}
}
