package com.example.Microservices.Service;

import com.example.Microservices.Entity.Employee;
import com.example.Microservices.Response.EmployeeResponse;
import com.example.Microservices.Respository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private ModelMapper mapper;


    public EmployeeResponse getEmployeeById (int id) {
        Optional<Employee> employee = empRepo.findById(id);
        EmployeeResponse empRes = mapper.map(employee, EmployeeResponse.class);
        return empRes;
    }

    public Employee saveEmployee (Employee emp) {
        return empRepo.save(emp);
    }

    public void deleteEmployeeById (int id) {
        empRepo.deleteById(id);
    }
}
