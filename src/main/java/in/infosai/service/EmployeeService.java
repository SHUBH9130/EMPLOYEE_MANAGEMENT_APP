package in.infosai.service;

import java.util.List;

import in.infosai.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> fetchAllEmp();

	public Employee fetchEmpById(Integer eid);

	public void deleteById(Integer eid);

	public Employee updateById(Employee employee);

	public List<Employee> saveAllEmployee(List<Employee> employees);

	public void deleteAllEmp();

	public Employee fetchEmpBySalary(double sal);

	public List<Employee> fetchEmpSalary(double sal);

}
