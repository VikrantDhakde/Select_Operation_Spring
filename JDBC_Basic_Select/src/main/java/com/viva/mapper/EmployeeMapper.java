package com.viva.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.beans.Employee;

public class EmployeeMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int count) throws SQLException {
		
		Employee e=new Employee();
		e.setEid(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setEsal(rs.getDouble(3));
		return e;
	}


	

}
