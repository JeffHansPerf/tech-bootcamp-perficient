package com.perficient.techbootcampjeffhanson.service;

import java.util.List;

import com.perficient.techbootcampjeffhanson.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {

    @Autowired
    CrudRepository crudRepository;

    public List<Company> getCompanyList() {
        return crudRepository.findAll();
    }

    public Company getCompanyById(Integer id) {
        return crudRepository.findById(id).get();
    }

    public void saveOrUpdateCompany(Company company) {
        crudRepository.save(company);
    }

    public void deleteCompany(Integer id) {
        crudRepository.deleteById(id);
    }

}
