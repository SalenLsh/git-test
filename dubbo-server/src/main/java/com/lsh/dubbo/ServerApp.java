package com.lsh.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ServerApp {

	public static void main(String[] args) throws IOException {
		 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "applicationProvider.xml" });  
	        context.start();  
	  
	        System.out.println("输入任意按键退出 ~ ");  
	        System.in.read();  
	        context.close();  
	}
}
