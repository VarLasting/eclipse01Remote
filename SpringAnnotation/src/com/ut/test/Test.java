package com.ut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ut.config.MyConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String x : beanDefinitionNames){
			System.out.println(x);
		}
		//����ʵ����
		Object obj1 = context.getBean("myFactoryBean");
	    System.out.println(obj1);
	    //��&�õ���������
//		Object obj2 = context.getBean("&myFactoryBean");
//		System.out.println(obj2);
		
		
		
//		Object bean = context.getBean("oilCar");
//		System.out.println("********" + bean);
//		Object bean2 = context.getBean("energyCar");
//		System.out.println("@@@@@@@@@" + bean2);

	
	}

}
