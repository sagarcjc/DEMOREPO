package com.AbcLoan.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AbcLoan.app.model.CustomerApplicationFrom;


@Repository
public interface CustomerApplicationRepository extends JpaRepository<CustomerApplicationFrom, Long>
{

}
