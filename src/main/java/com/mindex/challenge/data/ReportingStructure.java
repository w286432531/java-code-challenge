package com.mindex.challenge.data;

import java.util.List;

public class ReportingStructure {
    private Employee employee;
    private int numberOfReports ;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee(){
        return this.employee;
    }
    public int getNumberOfReports(){
        return this.numberOfReports;
    }
    public void setNumberOfReports(){
        int counter = 0;
        counter = count(this.employee,counter);
        this.numberOfReports = counter;
    }
    private int count(Employee employee, int counter){
        List<Employee> employees = employee.getDirectReports();
        if (employees!= null){
            for (int i = 0; i < employees.size(); i++) {
                counter++;
                count(employees.get(i), counter);
            }
        }
        return counter;
    }
}
