package com.homestay.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHello {
	@RequestMapping("/helloAction.action")
	public void helloAction() throws CloneNotSupportedException{
		System.out.println("浣犲ソ鍟�,鍚勪綅鍚屽!鍝堝搱鍝堜綘濂藉晩鍟婂晩");
		System.out.println("woshi hhhhlidahu");
		TestHello ss=new TestHello();
		ss.clone();
		  
		System.out.println("名侦探柯南");
		System.out.println("海贼王");
		System.out.println("test");
		System.out.println("haha ");
	
	}
}
