package com.perficient.techbootcampjeffhanson.service;

import com.perficient.techbootcampjeffhanson.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Company, Integer> {
}
