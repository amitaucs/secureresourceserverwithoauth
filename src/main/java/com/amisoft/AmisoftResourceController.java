package com.amisoft;

import com.amisoft.employee.EmployeeDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitdatta on 03/05/17.
 */

@RestController
@EnableResourceServer
public class AmisoftResourceController {


    @RequestMapping("/getemployee")
    public List<EmployeeDetails> getEmployeeDetails() {

        List<EmployeeDetails> employeeList = new ArrayList<>();

        EmployeeDetails empJohn = new EmployeeDetails("1", "John");
        EmployeeDetails empJonny = new EmployeeDetails("1", "Jonny");


        employeeList.add(empJohn);
        employeeList.add(empJonny);

        return employeeList;
    }

}
