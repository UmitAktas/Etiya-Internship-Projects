package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			// HQL --> Hibernate Query Language
			// Select * from City
			// from City c where c.countryCode='TUR' AND c.district='İstanbul'
			// from City c where c.name LIKE '%kar%' AND c.countryCode='TUR'
			// from City c ORDER BY c.name (ASC A'dan Z'ye veya DESC)
			// select c.countryCode from City c GROUP BY c.countryCode

			// List<City> cities = session.createQuery("from City c where c.name LIKE
			// '%kar%' AND c.countryCode='TUR'")
			// .getResultList();

			/*
			 * for (City city : cities) { System.out.println(city.getName()); }
			 */
			
			//CRUD Create Read Update Delete

			// INSERT			
			 /*City city = new City(); city.setName("Yozgat"); city.setCountryCode("TUR");
			 city.setDistrict("İç Anadolu"); city.setPopulation(300000);
			 session.save(city);*/
			 

			// UPDATE
			/*City city = session.get(City.class, 4080);
			city.setPopulation(350000);
			session.save(city);*/
			
			
			
			//DELETE
			City city = session.get(City.class, 4080);
			session.delete(city);

			session.getTransaction().commit();

		} finally {

			factory.close();

		}

	}

}
