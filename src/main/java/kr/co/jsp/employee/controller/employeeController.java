package kr.co.jsp.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.jsp.employee.DAO.employeeService;
import kr.co.jsp.employee.vo.employeeVO;


@Controller
public class employeeController {
	
	@Autowired
	employeeService empService;
	
	@RequestMapping(value="/employeeList", method=RequestMethod.POST)
	public String employeeADD(employeeVO evo,Model model) {
		empService.insertEmployee(evo);
		System.out.println(evo);
		List<employeeVO> employee = empService.selectEmployeeList(evo);
		model.addAttribute("employee", employee);
		return "redirect:/employeeList";
	}
	@RequestMapping(value="/employeeList", method=RequestMethod.GET)
	public String employeeList(employeeVO evo,Model model) {
		List<employeeVO> employee = empService.selectEmployeeList(evo);
		model.addAttribute("employee", employee);
		return "employeeList";
	}
	
	@RequestMapping(value="/employeeDetail/{employee_number}", method=RequestMethod.GET)
	public String employeeADD(@PathVariable("employee_number") int employee_number,Model model) {
		System.out.println(employee_number);
		model.addAttribute("employee", empService.selectEmpOne(employee_number));
		System.out.println(employee_number);
		return "employeeDetail";
	}
	
	@RequestMapping(value="/employeeUpdate/{employee_number}", method=RequestMethod.GET)
	public String employeeUpdate(@PathVariable("employee_number") int employee_number,Model model) {
		System.out.println(employee_number);
		empService.UpdateEmpOne(employee_number);
		System.out.println(employee_number);
		return "employeeDetail";
	}
	@RequestMapping(value="/employeeDelete/{employee_number}", method=RequestMethod.GET)
	public String employeeDelete(@PathVariable("employee_number") int employee_number,Model model) {
		System.out.println(employee_number);
		empService.DeleteEmpOne(employee_number);
		System.out.println(employee_number);
		return "redirect:/employeeList";
	}
}

