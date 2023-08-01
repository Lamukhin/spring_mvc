package com.lamukhin.spring.mvc_hibernate_aop.dao;

import java.util.List;

import com.lamukhin.spring.mvc_hibernate_aop.entity.Employee;

public interface EmployeeDAO {
	//DAO(Data Access Object) - вспомогательный компонент, ответственный
	//за работу с БД. В данном случае мы сперва создаем интерфейс, 
	//а потом от него создаем ДАО-классы.
	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployee(int id);

	public void deleteEmployee(int id);
}
