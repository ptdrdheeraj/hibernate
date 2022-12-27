package in.co.rays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestUser {

	public static void main(String[] args) {
		TestAdd();
	}

	private static void TestAdd() {
		User user = new User();
		
		
		user.setFname("Shyam");
		user.setLname("Verma");
		user.setUsername("Shyam123");
		user.setPwd("Shyam@123");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		
		Session session = factory.openSession();
		
	    Transaction trs = session.beginTransaction();
		session.save(user);
		
		trs.commit();
		session.close();
		System.out.println("Updated");
		 
		
	}
}
