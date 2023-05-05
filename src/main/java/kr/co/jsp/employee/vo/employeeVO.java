package kr.co.jsp.employee.vo;

public class employeeVO {
  private int employee_number;
  private String job_title;
  private String name;
  private String phone;
  private String email;
public int getEmployee_number() {
	return employee_number;
}
public void setEmployee_number(int employee_number) {
	this.employee_number = employee_number;
}
public String getJob_title() {
	return job_title;
}
public void setJob_title(String job_title) {
	this.job_title = job_title;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "employeeVO [employee_number=" + employee_number + ", job_title=" + job_title + ", name=" + name + ", phone="
			+ phone + ", email=" + email + "]";
}
  
  
}
