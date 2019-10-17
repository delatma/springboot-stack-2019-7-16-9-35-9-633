package com.tw.apistackbase.controller;
import com.tw.apistackbase.model.EmployeeModel;
import ch.qos.logback.core.joran.conditional.ThenOrElseActionBase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class EmployeeController {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    //    GET       /employees    #obtain employee list
    List<EmployeeModel> employeeList = new ArrayList<>();
    @GetMapping(path = "/employees", produces = {"application/json"})
    public List<EmployeeModel> getAll() {
        return employeeList.stream()
                .map(employee -> employee)
                .collect(Collectors.toList());
    }

//    GET       /employees/1  # obtain a certain specific employee
//    GET       /employees?page=1&pageSize=5  #Page query, page equals 1, pageSize equals 5
//    GET       /employees?gender=male   #screen all male employees
//    POST      /employees    # add an employeeapplica
//    PUT       /employees/1  #update an employee
//    DELETE    /employees/1  #delete an employee


}
