package com.Mindtree.Employe.Sorting;

import java.util.Comparator;

import com.Mindtree.Employe.Entity.Employe;





public class SortBasedOnName implements Comparator<Employe> {

	@Override
	public int compare(Employe d1, Employe d2) {

		return d1.getName().compareTo(d2.getName());
	}

	

}
