package com.tw.apistackbase.model;

import java.util.List;

public class EmployeeModel {
    private String companyName;
    private int employeeNumber;
    private List<EmployeeModel> employeeList;

    public String getCompanyName() {
        return companyName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public List<EmployeeModel> getEmployeeList() {
        return employeeList;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setEmployeeList(List<EmployeeModel> employeeList) {
        this.employeeList = employeeList;
    }
}
