package com.zk.myspringboot_003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "demo")
@PropertySource(value = {"classpath:application.properties"})
public class ConfigBean {
	private String name;
	
	private String age;

	private Map<String, String> login=new HashMap<String,String>();
	
	private List<String> urls=new ArrayList<String>();
	
	
	
	public Map<String, String> getLogin() {
		return login;
	}

	public void setLogin(Map<String, String> login) {
		this.login = login;
	}

	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ConfigBean [name=" + name + ", age=" + age + ", login=" + login + ", urls=" + urls + "]";
	}
	
	
}
