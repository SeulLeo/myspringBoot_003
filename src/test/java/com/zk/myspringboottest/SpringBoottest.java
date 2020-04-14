package com.zk.myspringboottest;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.zk.myspringboot_003.ConfigBean;
import com.zk.myspringboot_003.SpringBootApp;
import com.zk.service.HelloService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringBootApp.class})
public class SpringBoottest {
	
	@Autowired
	ConfigBean configBean;
	@Autowired
	private ConfigurableApplicationContext ioc;
	
	@Test
	public void testHelloService(){
		System.out.println(ioc.containsBean("HelloService"));
	}
	
	@Test
	public void contextLoad(){
		System.out.println(configBean);
	}
}
