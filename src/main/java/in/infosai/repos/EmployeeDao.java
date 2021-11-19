package in.infosai.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.infosai.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	public Employee findBysalary(double sal);

	public List<Employee> findBysalaryGreaterThanEqual(double sal);
}
