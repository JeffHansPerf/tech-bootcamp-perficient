package com.perficient.tbcjeffhans.service;

import com.perficient.tbcjeffhans.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Company, Integer> {
}
