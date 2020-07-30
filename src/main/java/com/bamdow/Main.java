package com.bamdow;


import com.bamdow.example.Car;
import com.bamdow.example.config.AppConfig;
import com.sun.xml.internal.xsom.parser.AnnotationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bamdow.example.Apple;
import com.bamdow.example.Fruit;
import com.bamdow.example.People;

public class Main {

	public static void main(String[] args) {
//		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		 // 通过xml 配置
//		 People a = (People)context.getBean(People.class);
//		 a.eat();

		 // annotation
		AnnotationConfigApplicationContext antx = new AnnotationConfigApplicationContext();
		antx.register(AppConfig.class);
		antx.refresh();
		Car car = (Car)antx.getBean("car");
		car.run();
	}
}
