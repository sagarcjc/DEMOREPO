package com.AbcLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CibilScore 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private Long cibilId;
private Integer cibilScore;
private String cibilScoreDate;	
private String customerPancardNo;
private Long  Status;





}
