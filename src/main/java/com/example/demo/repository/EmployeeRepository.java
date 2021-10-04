/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.EmployeeEntity;

/**
 * @author spandiarajan
 *
 */
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{

}
