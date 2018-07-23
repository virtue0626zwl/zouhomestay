package com.homestay.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHello {
	@RequestMapping("/helloAction.action")
	public void helloAction() throws CloneNotSupportedException{
		System.out.println("你好啊,各位同学!哈哈哈你好啊啊啊");
		System.out.println("woshi hhhhlidahu");
		TestHello ss=new TestHello();
		ss.clone();
		  
	}
}
