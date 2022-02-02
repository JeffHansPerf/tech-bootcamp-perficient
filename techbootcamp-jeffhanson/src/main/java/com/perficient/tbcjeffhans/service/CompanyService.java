package com.perficient.tbcjeffhans.service;

import java.util.List;

import com.perficient.tbcjeffhans.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public List<Company> getCompanyList() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Integer id) {
        return companyRepository.findById(id).get();
    }

    public void saveOrUpdateCompany(Company company) {
        companyRepository.save(company);
    }

    public void deleteCompany(Integer id) {
        companyRepository.deleteById(id);
    }

}
