package com.tutorialspoint.eclipselink.service.table;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.table.NonTeachingStaffTable;
import com.tutorialspoint.eclipselink.entity.table.TeachingStaffTable;

public class SaveClientTable {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Teaching staff entity
		TeachingStaffTable ts1 = new TeachingStaffTable(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaffTable ts2 = new TeachingStaffTable(2, "Manisha", "BSc BEd", "English");

		// Non-Teaching Staff entity
		NonTeachingStaffTable nts1 = new NonTeachingStaffTable(3, "Satish", "Accounts");
		NonTeachingStaffTable nts2 = new NonTeachingStaffTable(4, "Krishna", "Office Admin");

		// storing all entities
		entitymanager.persist(ts1);
		entitymanager.persist(ts2);
		entitymanager.persist(nts1);
		entitymanager.persist(nts2);

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
