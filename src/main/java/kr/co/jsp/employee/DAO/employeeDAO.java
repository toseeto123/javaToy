package kr.co.jsp.employee.DAO;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jsp.employee.vo.employeeVO;

@Repository
public class employeeDAO {

	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public void insertEmployee(employeeVO evo) {
		System.out.println("insertBefore");
		sessionTemplate.insert("employeeDAO.insert",evo);
		System.out.println("insertDAO");
	}

	public List<employeeVO> selectEmployeeList(employeeVO evo) {
		System.out.println("selectListBefore");
		return sessionTemplate.selectList("employeeDAO.select", evo);
	}

	public employeeVO selectEmpOne(int empNumber) {
		System.out.println("selectoneBefore");
		return sessionTemplate.selectOne("employeeDAO.selectEmpOne", empNumber);
	}

	public void UpdateEmpOne(int empNumber) {
		System.out.println("updateBefore");
		sessionTemplate.update("employeeDAO.update", empNumber);
	}

	public void deleteEmpOne(int employee_number) {
		sessionTemplate.delete("employeeDAO.delete",employee_number);
	}

}
