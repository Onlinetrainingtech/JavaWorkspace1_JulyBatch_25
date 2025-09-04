package str;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		
		//parent Object
		
		Vender v=new Vender();
		
		v.setVendorId(1001);
		v.setVendorName("azar");
		
		//Child Object
		
		Customer c1=new Customer();
		c1.setCustomerId(2001);
		c1.setCustomerName("raja");
		
		Set s=new HashSet<>();
		s.add(c1);
		
		v.setChildren(s);
		
		session.save(v);
		
		tx.commit();
		
		session.close();
		
		System.out.println("One to Many RelationShip");
		
		factory.close();
		

	}

}
