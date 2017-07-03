package com.atguigu.mybatis.dao;

import java.util.List;

import com.atguigu.mybatis.bean.Employee;

public interface EmployeeMapperPlus {

	Employee getEmpById(Integer id);

	Employee getEmpAndDept(Integer id);

	Employee getEmpByIdStep(Integer id, String dept_name);

	List<Employee> getEmpsByDeptId(Integer deptId);

}
