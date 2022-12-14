package createquery;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import pp.Emp;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure("pp/hibernate.cfg.xml").buildSessionFactory().openSession();
	
// HQL QUERY ALL COMMONLY USE METHOD 		
		Query qr=session.createQuery("from Emp where id=?1");
		qr.setParameter(1,104);
		//qr.setFirstResult(0);
		//qr.setMaxResults(4);
		List<Emp> al=qr.list();
		for( Emp e:al)
		{
			System.out.println(e.getId()+""+e.getName());
		}
		
		
	}

}
