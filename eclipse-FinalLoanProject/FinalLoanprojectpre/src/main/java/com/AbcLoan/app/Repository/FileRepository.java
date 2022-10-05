package com.AbcLoan.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AbcLoan.app.model.AllPersonalDocument;

@Repository
public interface FileRepository  extends JpaRepository<AllPersonalDocument, Long>{

}
