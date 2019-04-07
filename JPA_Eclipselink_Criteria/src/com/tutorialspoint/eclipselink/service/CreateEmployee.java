package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {

		Employee[] list = { new Employee(401, "Gopal", 40000, "Technical Manager"),
				new Employee(402, "Manisha", 40000, "Proof Reader"),
				new Employee(403, "Masthanvali", 35000, "Technical Writer"),
				new Employee(404, "Satish", 30000, "Technical Writer"),
				new Employee(405, "Krishna", 30000, "Technical Writer"),
				new Employee(406, "Kiran", 35000, "Proof Reader") };

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