package com.Mindtree.Employe.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mindtree.Employe.Entity.Employe;


@Repository
public interface EmployeRepository extends JpaRepository<Employe,Integer>  {

	public List<Employe> findByDid(Integer id);
}
