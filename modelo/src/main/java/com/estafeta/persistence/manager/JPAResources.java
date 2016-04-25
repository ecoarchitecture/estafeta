/**
 * 
 */
package com.estafeta.persistence.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author vanderluk
 *
 */
public class JPAResources {
	
	private static EntityManagerFactory emf;
	 
	  protected static EntityManagerFactory getEntityManagerFactory() {
	    try {
	    if ((emf==null) || (! emf.isOpen())) {
	      // change to "testing-psql" to engage my local PostgreSQL DB
	      emf = Persistence.createEntityManagerFactory("testing-h2");
	      }
	    } catch(Exception e) {
	      e.printStackTrace();
	    }
	    return emf;
	  }

}
