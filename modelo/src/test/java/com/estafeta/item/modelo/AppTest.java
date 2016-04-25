package com.estafeta.item.modelo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	
	
	
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

	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	
    	
    	
    	 EntityManager theManager = this.getEntityManagerFactory().createEntityManager();
    	 theManager.getTransaction().begin();
    	 
    	Cliente cliente = new Cliente();
    	cliente.setNombreComercial("Cliente");
    	
    	FolioGuiaAsignado folioGuias = new FolioGuiaAsignado();
   	 	folioGuias.setNumeroFolio("NUM_00001");
   	 	folioGuias.setNumeroGuia("GUI1-11");

   	 	Set<FolioGuiaAsignado> foliosGuias = new HashSet<FolioGuiaAsignado>();
   	 	foliosGuias.add(folioGuias);
    	
   	 	TipoContrato tipoContrato = new TipoContrato();
	 	tipoContrato.setDescripcion("Tipo de Contrato");
   	 	
   	 	Contrato contrato = new Contrato();
   	 	contrato.setCliente(cliente);
   	 	contrato.setFolioGuiaAsignados(foliosGuias);
   	 	contrato.setTipoContrato(tipoContrato);
   	 	
   	 	folioGuias.setContrato(contrato);
   	 	
   	 	
   	 	Set<Contrato> contratos = new HashSet<Contrato>();
   	 	contratos.add(contrato);
   	 	cliente.setContratos(contratos);
   	 	
   	 	theManager.persist(tipoContrato);
   	 	//theManager.persist(folioGuias);
    	theManager.persist(cliente);
    	
    	
    	List<Cliente> clientes = theManager.createQuery("from Cliente").getResultList();
    	assertTrue(clientes != null && !clientes.isEmpty());
    	
    	Iterator<Cliente> it = clientes.iterator();
    	while (it.hasNext()) {
			Cliente c = (Cliente) it.next();
			System.out.println("Cliente en DB : " + c);
		}
    	
    	
    	
    	
    	theManager.getTransaction().commit();
    	
    	
    }
}
