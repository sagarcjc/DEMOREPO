package com.AceHomeLoan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AceHomeLoan.app.model.AllPersonalDocs;

@Repository
public interface AllPersonalDocsRepository extends JpaRepository<AllPersonalDocs, Long>
{

}
