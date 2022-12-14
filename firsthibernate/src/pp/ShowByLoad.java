package pp;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ShowByLoad {

	public static void main(String[] args) {
		Session session=new Configuration().configure("pp/hibernate.cfg.xml").buildSessionFactory().openSession();
		
		//SHOW BY LOAD method
		
		//Emp e=session.load(Emp.class, new Integer(101));
		
		//SHOW BY GET method
		
		Emp e=session.get(Emp.class, new Integer(105));
		if(e!=null)
		{
		System.out.println(e.getId());
		System.out.println(e.getName());
		}
		else{
			
			System.out.println("no record found");
		}
	}

}
