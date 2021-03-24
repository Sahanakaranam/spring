package com.xworkz.cosmetic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springXml="cosmetic.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(springXml);
		Cosmetic cosmetic = container.getBean(Cosmetic.class);
		cosmetic.makesFacePresentable();
		cosmetic.enhanceTheBeauty();

	}

}
