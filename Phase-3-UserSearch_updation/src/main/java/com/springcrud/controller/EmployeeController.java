package com.springcrud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springcrud.beans.Employee;
import com.springcrud.dao.EmployeeDao;
@Controller
public class EmployeeController {
@Autowired
EmployeeDao dao;
@RequestMapping(value="/empform", method=RequestMethod.GET)
public String showForm(Model m){
m.addAttribute("emp", new Employee());
return "empform";
}
@RequestMapping("/viewemp")
public String viewemp(Model m){
List<Employee> empList= dao.getEmployeesDetails();

m.addAttribute("empList",empList);
return "viewemp";
}
@RequestMapping(value="/editemp/{eid}")
public String edit(@PathVariable int eid, Model m){
Employee emp=dao.getEmpId(eid);
m.addAttribute("emp",emp);
return "empeditform";
}
@RequestMapping(value="/editsave",method=RequestMethod.POST)
public String editSave(@ModelAttribute("emp") Employee emp){
System.out.println(emp.getEid());
dao.update(emp);
return "redirect:/viewemp";
}}