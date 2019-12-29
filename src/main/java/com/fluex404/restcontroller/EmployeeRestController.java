package com.fluex404.restcontroller;

import com.fluex404.model.Employee;
import com.fluex404.utils.EmpRestURIContats;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

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
    public ModelMap getEmployee(@PathVariable("id") int empId) throws Exception {
//        return empData.get(empId);
        ModelMap m = new ModelMap();
        try{
            if(empId == 1) {
                throw new Exception("Error tidak ditemukan");
            } else if(empId == 2) {
                throw new SQLException("SQLException, id="+empId);
            } else if(empId == 3) {
                throw new IOException("IOException, id=" + empId);
            } else {
                throw new Exception("Generic Exception, id="+empId);
            }
        }catch(Exception e) {

            m.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            m.put("message", e.getMessage());
            m.put("data", null);
            return m;

        }
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
