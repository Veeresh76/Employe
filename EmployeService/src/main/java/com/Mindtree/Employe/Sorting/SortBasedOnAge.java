package com.Mindtree.Employe.Sorting;

import java.util.Comparator;

import com.Mindtree.Employe.Entity.Employe;






public class SortBasedOnAge implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o2.getAge()-o1.getAge();
	}

}
