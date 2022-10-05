package com.AbcLoan.app.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerAddress
{
	@OneToOne
	Permanent permanent;
	@OneToOne
	Loacal local;

}
