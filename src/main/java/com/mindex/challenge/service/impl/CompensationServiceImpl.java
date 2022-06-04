package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.CompensationService;
import com.mindex.challenge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompensationServiceImpl implements CompensationService {
    @Autowired
    private CompensationRepository compensationRepository;
    @Autowired
    private EmployeeService employeeService;
    @Override
    public Compensation create(Compensation compensation) {
        compensationRepository.insert(compensation);
        return compensation;
    }

    @Override
    public Compensation read(String id) {
        Employee employee = employeeService.read(id);
        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }
        Compensation compensation = compensationRepository.findByEmployee(employee);
        return compensation;
    }
}
