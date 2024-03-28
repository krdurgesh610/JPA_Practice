package org.jsp.jpaPractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
		UserId userId = new UserId();
		userId.setEmail("abc@gmail.com");
		userId.setPhone(777);

		User user = new User();
		user.setName("ABC");
		user.setPassword("abc1234");
		user.setUserId(userId);

		EntityManager manager = Persistence.createEntityManagerFactory("development").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
	}
}
