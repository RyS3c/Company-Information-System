package com.example.Microservices.Configuration;

import com.example.Microservices.Service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EmployeeConfig {

    @Bean
    @Primary
    public EmployeeService employeeBean() {
        return new EmployeeService();
    }

    @Bean
    @Qualifier
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
