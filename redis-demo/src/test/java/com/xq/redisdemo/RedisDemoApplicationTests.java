package com.xq.redisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.xq.redisdemo.service.AppService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDemoApplicationTests {

	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Autowired
	private  AppService appService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testApp1(){
		String testStr = appService.testStr();
		System.out.println(testStr);
	}
	
	@Test
	public void test1(){
		redisTemplate.opsForValue().set("a1", "hello");
	}

}
