package com;

import com.employe.model.Employee;
import com.employe.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContext.class);

			EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
			List<Employee> employees = employeeService.getAllEmployees();

			for(Employee employee : employees){
				System.out.println(employee.getEmpNanme() + " at " + employee.getEmpLOcation());
			}



	}

}
