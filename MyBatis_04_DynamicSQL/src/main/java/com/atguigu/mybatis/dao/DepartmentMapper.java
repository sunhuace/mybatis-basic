package com.atguigu.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.bean.Department;

public interface DepartmentMapper {
	
	//此处的@Param配置的是对应的sql配置文件的参数名称
	Department getDeptById(@Param("id")Integer id, @Param("dept_name")String dept_name);
	
	Department getDeptByIdPlus(Integer id);

	Department getDeptByIdStep(Integer id);
	
	void insertDepart(Department departmen);
	
	List<Department> selectAllDepartment();
}
