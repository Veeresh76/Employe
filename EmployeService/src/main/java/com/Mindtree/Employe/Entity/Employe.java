package com.Mindtree.Employe.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private int sal;
	
	private int age;
	
	private String gender;
	
	private int did;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int id, String name, int sal, int age, String gender, int did) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.gender = gender;
		this.did = did;
	}

	public Employe( String name, int sal, int age, String gender, int did) {
		super();
		
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.gender = gender;
		this.did = did;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + ", gender=" + gender
				+ ", did=" + did + "]";
	}




}

