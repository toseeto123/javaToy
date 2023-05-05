package kr.co.jsp.employee.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jsp.employee.vo.employeeVO;

@Service
public class emplyoeeServiceImpl implements employeeService {
	
	@Autowired
	employeeDAO employeeDao;
	
	@Override
	public void insertEmployee(employeeVO evo) {
		employeeDao.insertEmployee(evo);
		System.out.println("insertserviceImpl");
		
	}
	@Override
	public List<employeeVO> selectEmployeeList(employeeVO evo) {
		return employeeDao.selectEmployeeList(evo);
	}
	
	@Override
	public employeeVO selectEmpOne(int empNumber) {
		return employeeDao.selectEmpOne(empNumber);
	}
	
	@Override
	public void UpdateEmpOne(int empNumber) {
		employeeDao.UpdateEmpOne(empNumber);
	}
	
	@Override
	public void DeleteEmpOne(int employee_number) {
		employeeDao.deleteEmpOne(employee_number);
	}
}
