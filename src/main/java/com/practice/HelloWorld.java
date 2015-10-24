package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.JedisPoolConfig;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext content=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		RedisTemplate jedisTemplate=content.getBean(RedisTemplate.class);
//		 jedisTemplate.opsForValue().set("aa", "arg1");
		System.out.println(jedisTemplate.opsForValue().get("aa"));
	}

}
