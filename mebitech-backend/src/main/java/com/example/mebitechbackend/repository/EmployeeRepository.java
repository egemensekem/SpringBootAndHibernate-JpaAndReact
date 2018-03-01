package com.example.mebitechbackend.repository;

import com.example.mebitechbackend.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by egemensekem on 3/1/2018.
 */
@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{


}
