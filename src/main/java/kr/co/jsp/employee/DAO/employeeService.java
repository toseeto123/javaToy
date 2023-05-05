package kr.co.jsp.employee.DAO;

import java.util.ArrayList;
import java.util.List;

import kr.co.jsp.employee.vo.employeeVO;

public interface employeeService {
	
	public void insertEmployee(employeeVO evo);

	public List<employeeVO> selectEmployeeList(employeeVO evo);

	public employeeVO selectEmpOne(int empNumber);

	public void UpdateEmpOne(int employee_number);

	public void DeleteEmpOne(int employee_number);
}
