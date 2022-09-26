package com.sonata.training.Controller;

import java.util.List;
import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.training.Model.Employee;
import com.sonata.training.Repository.EmployeeRepository;


@RestController



public class EmployeeController {
  
    Optional<Employee> p1;
    
    
    @Autowired
    private EmployeeRepository prepository;
    
    @GetMapping("/employee_details")
    public List<Employee> getAllEmployee(){
          return prepository.findAll(); 
          //QuerySelect * from employee
    }
}
