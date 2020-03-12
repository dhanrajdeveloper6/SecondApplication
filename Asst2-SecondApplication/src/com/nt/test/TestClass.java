package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.FlipkartTransaction;

public class TestClass {
	
	
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		FlipkartTransaction bean = factory.getBean("ft",FlipkartTransaction.class);
		int amt = bean.Trans(5000);
		System.out.println("");
		
	}

}
