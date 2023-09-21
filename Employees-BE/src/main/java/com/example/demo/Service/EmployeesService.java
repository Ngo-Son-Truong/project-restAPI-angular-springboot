package com.example.demo.Service;

import com.example.demo.Model.Employees;

import java.util.List;

public interface EmployeesService {
    List<Employees> findAll();

    Employees saveorupdate(Employees employees);

    Employees findById(Long id);

    void delete(Long id);

}
