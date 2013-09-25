package com.tocean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("knight.xml");
		Knight knight = (Knight) appContext.getBean("knight");
		knight.embarkOnQuest();
	}
}
