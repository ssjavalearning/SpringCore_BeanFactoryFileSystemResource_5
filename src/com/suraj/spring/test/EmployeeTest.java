package com.suraj.spring.test;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.suraj.spring.beans.Employee;

public class EmployeeTest {

	public static void main(String[] args) throws IOException {
		
		// if bean factory and spring.xml file at different location then must use FileSystemResource. 
		Resource resource = new FileSystemResource("H:/spring.xml");
		System.out.println(resource.getDescription());
		System.out.println(resource.getURL());
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee employee = factory.getBean("employee", Employee.class);
		System.out.println(employee.getEmpId()+"\t"+employee.getEmpName());
	}

}
