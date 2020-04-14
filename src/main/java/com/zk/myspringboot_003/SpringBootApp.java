package com.zk.myspringboot_003;

import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@SpringBootApplication
@ImportResource(locations={"classpath:beans.xml"})
//@ImportResource：导入spring配置文件让配置文件的内容生效
public class SpringBootApp implements ApplicationListener<ApplicationStartedEvent>{

	public static void main(String[]args){
		SpringApplication.run(SpringBootApp.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		// TODO Auto-generated method stub
		Properties properties;
		try {
			properties = PropertiesLoaderUtils.loadAllProperties("classpath:application.properties");
			System.out.println(properties);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
