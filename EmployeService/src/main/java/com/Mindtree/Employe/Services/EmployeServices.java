package com.Mindtree.Employe.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Mindtree.Employe.Entity.Employe;
import com.Mindtree.Employe.Repository.EmployeRepository;
import com.Mindtree.Employe.Sorting.SortBasedOnAge;
import com.Mindtree.Employe.Sorting.SortBasedOnName;


@Service
public class EmployeServices {


	@Autowired
	EmployeRepository employerepository;

	public void tests() {
		
		Employe e1= new Employe("veer",30000,23,"male",101);
		Employe e2= new Employe("abhi",30000,20,"male",101);
		Employe e3= new Employe("adhi",30000,25,"male",101);
		Employe e4= new Employe("rohan",30000,23,"male",101);
		Employe e5= new Employe("raghav",30000,28,"male",101);
	
		employerepository.save(e1);
		employerepository.save(e2);
		employerepository.save(e3);
		employerepository.save(e4);
		employerepository.save(e5);
		
	}


	public List<Employe> getAllEmp() {

		return employerepository.findAll();
	}


	public List<Employe> getEmployesByDid(int did) {

	List<Employe> l= employerepository.findByDid(did);
	Collections.sort(l,new SortBasedOnAge());
	return l;
	}


	public Employe addEmp(Employe e) {

		return employerepository.save(e);
	}


	public List<Employe> getEmployesByDidinSBN(int did) {
		
		List<Employe> l= employerepository.findByDid(did);
		Collections.sort(l,new SortBasedOnName());
		return l;
	}


	

}
