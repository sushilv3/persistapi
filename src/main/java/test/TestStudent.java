package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entites.StudentEntity;

public class TestStudent {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("RelationsTest");
	  private static EntityManager em = factory.createEntityManager();
	  public static void main(String[] args) {
		    // testCreateCourse();
		    // testCreateStudent();
		  
		  em.getTransaction().begin();
//		   StudentEntity s1 = new StudentEntity("001");
//		   em.persist(s1);
		    StudentEntity fetchedStudent = em.find(StudentEntity.class, "001");
		    System.out.println("Fetched Student : " +fetchedStudent);
		  em.getTransaction().commit();

		  }
}
