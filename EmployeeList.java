package ProblemsUsingStreams;

import java.util.Objects;

public class EmployeeList {
	
	private int id;
	private String empName;
	private long empSalary;
	private String empAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empAddress, empName, empSalary, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeList other = (EmployeeList) obj;
		return Objects.equals(empAddress, other.empAddress) && Objects.equals(empName, other.empName)
				&& empSalary == other.empSalary && id == other.id;
	}
	public EmployeeList(int id, String empName, long empSalary, String empAddress) {
		super();
		this.id = id;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}
	

}
