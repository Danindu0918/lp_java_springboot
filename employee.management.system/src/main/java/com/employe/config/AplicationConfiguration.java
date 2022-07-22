package com.employe.config;

import com.employe.service.EmployeeService;
import com.employe.service.EmployeeServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScans("com.krishantha")
@PropertySource("application.properties")
public class AplicationConfiguration {

    @Bean(name = "employeeService")
    @Scope("property")
    public EmployeeService getEmployeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        return (EmployeeService) employeeService;
    }

//    public static PropertySourcePlaceholerConfigur getPropertySourcePlaceholerConfigur(){
//        return PropertySourcePlaceholerConfigur;
//    }
}
