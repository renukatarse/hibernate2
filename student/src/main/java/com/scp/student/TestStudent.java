package com.scp.student;

    import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class TestStudent {

		public static void main(String[] args) {

			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			
			Student stud=new Student("Amol", "Sonvane");
			ses.save(stud);
			ses.flush();
			tx.commit();
			
			ses.close();
			
		}

	}



