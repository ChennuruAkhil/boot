package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.Employee;
import com.example.demo.repository.EmployeeRepo;
@CrossOrigin(origins="http://localhost:4200")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	EmployeeRepo emp;
	@RequestMapping("/list")
	public List<Employee> getList(){
		System.out.println("list");
		return emp.findAll();
	}
	
	@RequestMapping("/get")
	public Employee getData(String empname){
		System.out.println("data");
		System.out.println(empname);
		return emp.findByUsername(empname);
	}
	
	
	@RequestMapping("/update")
	public Employee getUpdate(String empname, String password){
		System.out.println(password);
		System.out.println(empname);
		Employee e1=emp.findByUsername(empname);
		e1.setPassword(password);
		emp.save(e1);
		return emp.findByUsername(empname);
	}
	
	

	@RequestMapping("/delete")
	public String deleteData(String empname){
		System.out.println("delete");
		System.out.println(empname);
		//emp.deleteByUsername(empname);
		Employee e1=emp.findByUsername(empname);
		emp.delete(e1);
		return "Deleted successfully";
	}
	
}
