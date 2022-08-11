package com.Mindtree.Employe.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mindtree.Employe.Entity.Employe;
import com.Mindtree.Employe.Services.EmployeServices;



@RestController
public class EmployeController {

	@Autowired
	EmployeServices employeServices;
	
	//test
	@GetMapping("/test")
	public String test() {
		employeServices.tests();
		return "done";
	}
	
	
	//Add Employe By Employe object and Department Id
	     @PostMapping("/addEmp")
	      public Employe addEmploye(@RequestBody Employe e) {
		 
	    	 return   employeServices.addEmp(e);
		  
		
	}
		
	
	
	//Get all Employe	
    @GetMapping("/allEmp")
  public List<Employe> getAllEmploye(){
   return	employeServices.getAllEmp();	
		}
		
    
  //Get all Employe	with same DID in sort by age order
    @GetMapping("/EmpSBA/{did}")
  public List<Employe> getEmpsByDid(@PathVariable ("did") int did){
   return	employeServices.getEmployesByDid(did);	
		}
    
    //Get all Employe	with same DID in sort by age name
    @GetMapping("/EmpSBN/{did}")
  public List<Employe> getEmpsByDidInSBN(@PathVariable ("did") int did){
   return	employeServices.getEmployesByDidinSBN(did);	
		}
    
	}
	
	
	

