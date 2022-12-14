package pp;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("pp/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Emp e=new Emp();
		e.setId(106);
		e.setName("sachin");
		session.persist(e);
		tx.commit();
		sf.close();
		System.out.println("record added");
		
		

	}

}
