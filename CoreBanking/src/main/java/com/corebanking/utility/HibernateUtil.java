package com.corebanking.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// declare for global visible
	private static ThreadLocal<Session> threadLocal = new ThreadLocal();
	// declare for global visible
	private static SessionFactory factory;

	static {
		Configuration cfg = null;
		// Active hibernate framework and read and store HB cfg file,mapping
		// data into configuration obj
		cfg = new Configuration().configure("com/das/cfgs/hibernate.cfg.xml");
		// create sessionfactory object
		System.out.println(cfg);
		factory = cfg.buildSessionFactory();
		System.out.println(factory);
		System.out.println("SessionFactoryHashCode::" + factory.hashCode());
	}// static block

	public static Session getSession() {
		Session ses = null;
		// get session obj from thredlocal
		ses = threadLocal.get();
		if (ses == null) {
			// if not there create new session object
			ses = factory.openSession();
			// set session object to threadlocal
			threadLocal.set(ses);
		}
		System.out.println("Session object hash code" + ses.hashCode());
		return ses;
	}// getSession()

	public static void closeSession() {
		Session ses = null;
		// close session object
		ses = threadLocal.get();
		if (ses != null) {
			ses.close();
			threadLocal.remove();
		}
	}// closeSession()

	public static void closeSessionFactory() {
		factory.close();
	}// closeSessionFactory()
}
