package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Department;

import java.util.List;

public interface DepartmentMapper {
	
	Department getDeptById(Integer id);

	Department getDeptByIdPlus(Integer id);

	Department getDeptByIdStep(Integer id);

	List<Department> getDepartmentByPolo(Department department);
}
