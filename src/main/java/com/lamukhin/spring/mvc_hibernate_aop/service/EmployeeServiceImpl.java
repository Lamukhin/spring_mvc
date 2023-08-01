package com.lamukhin.spring.mvc_hibernate_aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lamukhin.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.lamukhin.spring.mvc_hibernate_aop.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDao;
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
		
	}
	@Override
	@Transactional
	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}
	@Override
	@Transactional
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
		
	}

}
