package in.infosai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DTLS")
public class Employee {
	
	@Id
	@SequenceGenerator(name = "EMP_SEQ",allocationSize = 1,sequenceName = "EMP_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="EMP_SEQ" )
	private Integer empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_COMPANY")
	private String companyName;
	
	@Column(name = "EMP_DESIGNATION")
	private String desgn;

	@Column(name = "EMP_SALARY")
	private double salary;
	
	public Employee() {
	System.out.println("Employee :: constructor");
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}//class
