package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {

		Employee[] list = { new Employee(1201, "Gopal", 40000, "Technical Manager"),
				new Employee(1202, "Manisha", 40000, "Proof Reader"),
				new Employee(1203, "Masthanvali", 40000, "Technical Writer"),
				new Employee(1204, "Satish", 30000, "Technical Writer"),
				new Employee(1205, "Krishna", 30000, "Technical Writer"),
				new Employee(1206, "Kiran", 35000, "Proof Reader") };

		for (Employee emp : list)
			Create(emp);

	}

	public static void Create(Employee e) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Employee employee = new Employee(e.getEid(), e.getEname(), e.getSalary(), e.getDeg());

		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();

	}
}