package com.zk.myspringboot_003;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${demo.name}")
	private String name;
	@Value("${demo.age}")
	private String age;
	
	
	@Autowired
	private Environment environment;
//	@Autowired
//	private ConfigBeanValue configbeanValue;
	
	@Autowired
    private ConfigBean configBeanProp;
	@RequestMapping("/demo")
	public String hello()
	{
		return "hello,"+name+",you are "+age+"demo1";
	}
	
	@RequestMapping("/demo2")
	public String getprops(){
		String name=environment.getProperty("demo.name");
		String age=environment.getProperty("demo.age");
		List<String> urlslist=configBeanProp.getUrls();
		Map<String,String> loginmap=configBeanProp.getLogin();
		for(Entry<String, String> e:loginmap.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		return "hello,"+name+".you are "+age+"demo2\n"+urlslist.toString()+"\n"+loginmap.get("username");
	}
	
	@RequestMapping("/demo3")
	public String getBean(){
		String name=configBeanProp.getName();
		String age=configBeanProp.getAge();
		return "hello,"+name+".you are "+age+"demo3";
	}
}
