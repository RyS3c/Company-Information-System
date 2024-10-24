package com.example.Microservices.Controller;

import com.example.Microservices.Entity.Employee;
import com.example.Microservices.Response.EmployeeResponse;
import com.example.Microservices.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/app/")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
        EmployeeResponse emp = empService.getEmployeeById(id);
        if(emp == null) {
            System.out.println("employee id hasn't found");
            return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body(null);
        }else {
            return ResponseEntity.status(HttpStatus.OK).body(emp);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
        Employee empres = empService.saveEmployee(emp);
        return
                ResponseEntity.status(HttpStatus.OK).body(empres);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeById(@PathVariable("id") int id) {
      empService.deleteEmployeeById(id);
    }
}
