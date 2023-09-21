package com.example.demo.DAO;

import com.example.demo.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesDAO extends JpaRepository<Employees,Long> {
}
