package com.tw.apistackbase.controller;
import com.tw.apistackbase.model.CompanyModel;
import ch.qos.logback.core.joran.conditional.ThenOrElseActionBase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
public class CompanyController {
    private final Logger log = Logger.getLogger(this.getClass().getName());

//    GET       /companies    #obtain company list
//    GET       /companies/1  #obtain a certain specific company
//    GET       /companies/1/employees  # obtain list of all employee under a certain
//    specific company
//    GET       /companies?page=1&pageSize=5  #Page query, if page equals 1, pageSize equals 5, it will return the data in company list from index 0 to index 4.
//    POST      /companies    #add a company
//    PUT       /companies/1  #update a company basic infomation
//    DELETE    /companies/1  # delete all employees belong to this company
//    specific company
}
