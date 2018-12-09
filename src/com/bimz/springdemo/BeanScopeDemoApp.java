package com.bimz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
						
				// retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				
				Coach theSecondCoach = context.getBean("myCoach", Coach.class);

				
				// call methods on the bean
				System.out.println("Is theCoach And theSecondCoach Pointing same reference : "+ (theCoach==theSecondCoach));
				System.out.println(theCoach.getDailyFortune());
				// close the context
				context.close();
	}

}
