package com.javaproject.customer.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaproject.customer.springmvc.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
