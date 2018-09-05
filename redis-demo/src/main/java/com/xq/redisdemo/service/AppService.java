package com.xq.redisdemo.service;

import org.springframework.cache.annotation.Cacheable;

public interface AppService {
	
	//注: 在redis里面的会形成value::key 的格式key
	@Cacheable(value="app",key="'testString'")
	public String testStr(); 
}
