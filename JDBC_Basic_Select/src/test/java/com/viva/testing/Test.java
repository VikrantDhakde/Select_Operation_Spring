package com.viva.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.beans.Employee;
import com.app.config.AppConfig;
import com.viva.mapper.EmployeeMapper;

public class Test {

	@org.junit.Test
	public void test() {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt=(JdbcTemplate)ac.getBean("jt");
		
		String sql="select * from emp where eid=?;";
		EmployeeMapper empMapper=new EmployeeMapper();
		
		Employee emp=jt.queryForObject(sql,empMapper,102);
		
		if(emp!=null)
			System.out.println(emp);
		else
			System.out.println("Employee Not Found");
		
	}

}
