package org.sqli.entities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbSessionManager {

	private static final Configuration conf = new Configuration();
	public SessionFactory factory;

	public HbSessionManager() {
		conf.configure("hibernate.cfg.xml");
		factory = conf.buildSessionFactory();
	}

}
