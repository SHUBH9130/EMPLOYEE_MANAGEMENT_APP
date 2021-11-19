package in.infosai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.infosai.entity.Employee;
import in.infosai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	// create employee
	// http://localhost:8081/employee
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

		Employee saveEmployee = service.saveEmployee(employee);

		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);
	}

	// Save All Employee
	// http://localhost:8081/employees
	@PostMapping("/employees")
	public ResponseEntity<List<Employee>> saveAllEmployee(@RequestBody List<Employee> employees) {

		List<Employee> saveAllEmployee = service.saveAllEmployee(employees);

		return new ResponseEntity<List<Employee>>(saveAllEmployee, HttpStatus.OK);

	}

	// Get All Employee
	// http://localhost:8081/employee
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> fetchAllEmp() {

		List<Employee> fetchAllEmp = service.fetchAllEmp();

		return new ResponseEntity<List<Employee>>(fetchAllEmp, HttpStatus.OK);
	}

	// Get Employee By Id
	// http://localhost:8081/employee/id
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> fetchEmpById(@PathVariable("id") Integer eid) {

		Employee fetchEmpById = service.fetchEmpById(eid);
		return new ResponseEntity<Employee>(fetchEmpById, HttpStatus.FOUND);
	}

	// http://localhost:8081/employeesal/sal
	@GetMapping("/employeesal/{sal}")
	public ResponseEntity<Employee> fetchEmpBySalary(@PathVariable("sal") double sal) {

		Employee fetchEmpBySalary = service.fetchEmpBySalary(sal);

		return new ResponseEntity<Employee>(fetchEmpBySalary, HttpStatus.OK);
	}

	// http://localhost:8081/employeeallsal/sal
	@GetMapping("/employeeallsal/{sal}")
	public ResponseEntity<List<Employee>> fetchEmpSalary(@PathVariable("sal") double sal) {

		List<Employee> fetchEmpSalary = service.fetchEmpSalary(sal);

		return new ResponseEntity<List<Employee>>(fetchEmpSalary, HttpStatus.OK);
	}

	// Delete Employee By Id
	// http://localhost:8081/employee/id
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer eid) {

		service.deleteById(eid);

		return new ResponseEntity<String>("Employee id " + eid + " deleted", HttpStatus.OK);

	}

	// Delete All Employee
	// http://localhost:8081/deleteemployees
	@DeleteMapping("/deleteemployees")
	public ResponseEntity<Void> DeleteAllEmp() {

		service.deleteAllEmp();
		String msg = "Employees are deleted";
		System.out.println(msg);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	// Update Employee By Id

	// http://localhost:8081/employee
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateById(@RequestBody Employee employee) {

		Employee updateById1 = service.updateById(employee);

		return new ResponseEntity<Employee>(updateById1, HttpStatus.CREATED);

	}

}// controller
