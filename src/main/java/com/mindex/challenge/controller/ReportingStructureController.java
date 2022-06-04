package com.mindex.challenge.controller;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportingStructureController {
    @Autowired
    private ReportingStructureService reportingStructureService;
    @GetMapping("/ReportingStructure/{id}")
//    public ReportingStructure read(@PathVariable String id) {
//        Employee employee = employeeService.read(id);
//        if (employee == null) {
//            throw new RuntimeException("Invalid employeeId: " + id);
//        }
//        ReportingStructure result = new ReportingStructure();
//        result.setEmployee(employee);
//        result.setNumberOfReports();
//        return result;
//    }
    public ReportingStructure read(@PathVariable String id) {
        return reportingStructureService.read(id);
    }
}
