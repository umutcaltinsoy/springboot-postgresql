package com.example.springbootpostgresqlhibernatecrud.repository;

import com.example.springbootpostgresqlhibernatecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
