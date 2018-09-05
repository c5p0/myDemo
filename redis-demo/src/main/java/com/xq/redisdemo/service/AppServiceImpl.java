package com.xq.redisdemo.service;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

	@Override
	public String testStr() {
		// TODO Auto-generated method stub
		System.out.println("没有从缓存中取");
		return "123456";
	}

}
