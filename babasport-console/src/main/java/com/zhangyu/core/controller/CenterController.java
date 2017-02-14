/**
 * @Description 后台管理
 * @author ZhangYu
 * @date 下午5:09:33
 */
package com.zhangyu.core.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangyu.core.bean.TestTb;
import com.zhangyu.core.service.TestTbService;

/**
 * @author ZhangYu
 *
 */
@Controller
public class CenterController {

	@Autowired
	private TestTbService testTbService;
	
	@RequestMapping(value = "/test/index.do")
	public String index(Model model){
		
		TestTb testTb = new TestTb();
		testTb.setName("张瑀3");
		testTb.setBirthday(new Date());
		
		testTbService.insertTestTb(testTb);
		
		return "index";
	}
	
}
