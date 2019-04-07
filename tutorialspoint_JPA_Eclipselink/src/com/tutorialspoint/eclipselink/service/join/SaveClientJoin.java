package com.tutorialspoint.eclipselink.service.join;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.join.NonTeachingStaffJoin;
import com.tutorialspoint.eclipselink.entity.join.TeachingStaffJoin;

public class SaveClientJoin {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Teaching staff entity
		TeachingStaffJoin ts1 = new TeachingStaffJoin(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaffJoin ts2 = new TeachingStaffJoin(2, "Manisha", "BSc BEd", "English");

		// Non-Teaching Staff entity
		NonTeachingStaffJoin nts1 = new NonTeachingStaffJoin(3, "Satish", "Accounts");
		NonTeachingStaffJoin nts2 = new NonTeachingStaffJoin(4, "Krishna", "Office Admin");

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
