package com.atguigu.mybatis.dao;

import java.util.List;

import com.atguigu.mybatis.bean.Department;

public interface DepartmentMapper {
	
	public Department getDeptById(Integer id);
	
	public Department getDeptByIdPlus(Integer id);

	public Department getDeptByIdStep(Integer id);
	
	public void insertDepart(Department departmen);
	
	List<Department> selectAllDepartment();
}
