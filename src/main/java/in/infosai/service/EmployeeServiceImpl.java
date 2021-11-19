package in.infosai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.infosai.entity.Employee;
import in.infosai.repos.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		Employee save = dao.save(employee);
		return save;
	}

	@Override
	public List<Employee> fetchAllEmp() {
		
		List<Employee> findAll = dao.findAll();
		
		return findAll;
	}

	@Override
	public Employee fetchEmpById(Integer eid) {
		
		Optional<Employee> findById = dao.findById(eid);
		
		return findById.get();
		
	}

	@Override
	public void deleteById(Integer eid) {
		
		dao.deleteById(eid);
		
	}

	@Override
	public Employee updateById(Employee employee) {
		
		Optional<Employee> findById = dao.findById(employee.getEmpId());
		
		if(findById.isPresent()) {
			
			Employee employee2 = findById.get();
			
			employee2.setCompanyName(employee.getCompanyName());
			employee2.setEmpName(employee.getEmpName());
			employee2.setDesgn(employee.getDesgn());
			employee2.setSalary(employee.getSalary());
			return dao.save(employee);
		}
		
		return null;
	}

	@Override
	public List<Employee> saveAllEmployee(List<Employee> employees) {
		
		List<Employee> saveAll = dao.saveAll(employees);
		
		return saveAll;
	}

	@Override
	public void deleteAllEmp() {
		dao.deleteAll();
		System.out.println("All Employees are deleted...");
	}

	@Override
	public Employee fetchEmpBySalary(double sal) {
		Employee findBysalary = dao.findBysalary(sal);
		
		return findBysalary;
	}

	@Override
	public List<Employee> fetchEmpSalary(double sal) {
		List<Employee> findBysalaryGreaterThanEqual = dao.findBysalaryGreaterThanEqual(sal);
		return findBysalaryGreaterThanEqual;
	}

}
