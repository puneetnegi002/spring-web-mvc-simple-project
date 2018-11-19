package com.decipherzone.springmvc.controllers;

import com.decipherzone.springmvc.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class EmployeeController {
    List<Employee> list = new ArrayList<Employee>();

    @RequestMapping("/employeeform")

    public ModelAndView showform() {
        return new ModelAndView("employeeform", "command", new Employee());
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("emp") Employee emp) {

        int id = 0;
        for (Employee empp : list) {
            id = empp.getId();
        }
        id++;
        String name = emp.getName();
        float salary = emp.getSalary();
        String designation = emp.getDesignation();
        emp = new Employee(id, name, salary, designation);
        list.add(emp);
        return new ModelAndView("redirect:/viewform");
    }

    @RequestMapping("/viewform")
    public ModelAndView viewemp() {

        return new ModelAndView("viewform", "list", list);
    }
}

