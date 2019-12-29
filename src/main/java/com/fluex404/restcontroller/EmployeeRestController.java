package com.fluex404.restcontroller;

import com.fluex404.model.Employee;
import com.fluex404.utils.EmpRestURIContats;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.Logger;

@RestController
public class EmployeeRestController {
    // Map to store employees, ideally we should use database
    Map<Integer, Employee> empData = new HashMap<>();

    @RequestMapping(value = EmpRestURIContats.DUMMY_EMP, method = RequestMethod.GET)
    public Employee getDummyEmployee(){
        Employee emp = new Employee();
        emp.setId(9999);
        emp.setName("Dummy");
        emp.setCreatedDate(new Date());
        empData.put(emp.getId(), emp);
        return emp;
    }
    @GetMapping(EmpRestURIContats.GET_EMP)
    public Employee getEmployee(@PathVariable("id") int empId){
        return empData.get(empId);
    }
    @GetMapping(EmpRestURIContats.GET_ALL_EMP)
    public List<Employee> getAllEmployees(){
        List<Employee> emps = new ArrayList<>();
        Set<Integer> empIdKeys = empData.keySet();

        for(Integer i : empIdKeys) {
            emps.add(empData.get(i));
        }

        return emps;
    }
    @PostMapping(EmpRestURIContats.CREATE_EMP)
    public Employee createEmployee(@RequestBody Employee emp) {
        emp.setCreatedDate(new Date());
        empData.put(emp.getId(), emp);
        return emp;
    }
    @PutMapping(EmpRestURIContats.DELETE_EMP)
    public Employee delete(@PathVariable("id") int empId) {
        Employee emp = empData.get(empId);
        empData.remove(empId);
        return emp;
    }
}
