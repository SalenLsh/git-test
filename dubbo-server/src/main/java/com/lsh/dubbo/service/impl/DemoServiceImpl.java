package com.lsh.dubbo.service.impl;

import com.lsh.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
        System.out.println("init : " + name);  
        return "hello " + name;  
	}

}
