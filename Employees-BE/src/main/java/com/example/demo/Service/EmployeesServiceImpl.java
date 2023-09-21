package com.example.demo.Service;

import com.example.demo.DAO.EmployeesDAO;
import com.example.demo.Model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeesService{
    @Autowired
    EmployeesDAO employeesDAO;

    public List<Employees> findAll() {
        return employeesDAO.findAll();
    }

    @Override
    public Employees saveorupdate(Employees employees) {
        return employeesDAO.save(employees);
    }

    @Override
    public Employees findById(Long id) {
        return employeesDAO.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        employeesDAO.deleteById(id);
    }
}
