package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.EmployeeService;
import com.mindex.challenge.service.ReportingStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {
    @Autowired
    private EmployeeService employeeService;
    @Override
    public ReportingStructure read(String id) {
        Employee employee = employeeService.read(id);
        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }
        ReportingStructure result = new ReportingStructure();
        result.setEmployee(employee);
        result.setNumberOfReports();
        return result;
    }
}
