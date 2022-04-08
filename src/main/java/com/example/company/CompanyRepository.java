package com.example.company;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository
        extends CrudRepository<com.example.company.Company,
                Integer> {

    Company findById(int id);
    List<Company> findAll();
    void deleteById(int id);
}