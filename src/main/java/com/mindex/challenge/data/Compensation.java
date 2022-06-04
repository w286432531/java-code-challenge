package com.mindex.challenge.data;

import java.time.LocalDate;

public class Compensation {
    private Employee employee;
    private int salary;
    private LocalDate effectiveDate;

    public Compensation() {
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee(){
        return this.employee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

}
