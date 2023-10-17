package com.learn.test;

import com.learn.MyConfig;
import com.learn.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(MyConfig.class);
		MyService myService = annotationConfigApplicationContext.getBean(MyService.class);
		myService.run();
		System.out.println(myService.getName());
		
		Object name = annotationConfigApplicationContext.getBean("hello");
		System.out.println(name);
	}
}
