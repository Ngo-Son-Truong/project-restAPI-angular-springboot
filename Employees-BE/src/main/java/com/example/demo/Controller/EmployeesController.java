package com.example.demo.Controller;

import com.example.demo.DAO.EmployeesDAO;
import com.example.demo.Model.Employees;
import com.example.demo.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class EmployeesController {
    @Autowired
    EmployeesService employeesService;
    @GetMapping("/employees") public List<Employees> findAll(){
        return employeesService.findAll();
    }

    @PostMapping("/employees")
    public Employees save(@RequestBody Employees employees) {
        return employeesService.saveorupdate(employees);
    }

    @PutMapping("/employees/{id}")
    public Employees update(@PathVariable("id") Long id,@RequestBody Employees employees) {
        return employeesService.saveorupdate(employees);
    }

    @GetMapping("/employees/{id}")
    public Employees findById(@PathVariable("id") Long id) {
       return employeesService.findById(id);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable("id") Long id) {
        employeesService.delete(id);
    }
}
