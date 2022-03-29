package ansatt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import database.Database;

public class AnsattDAO {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("oblig");
	// this is my thing
	public Ansatt finnAnsattMedId(int id) {
		return Database.letID(id);
	}
	
	public static Ansatt finnAnsattMedBrknavn(String soek) {
		return Database.letBrk(soek);
	}
	
	public void skrivUtAnsatte() {
		System.out.println(Database.getAnsatte());
	}
	
	public void stillingsEndring(int id, String nyStilling) {
		Database.stillingsEndring( id, nyStilling);
	}
	
	public void loennsEndring(int id, int loenn) {
		Database.loennsEndring( id, loenn);
	}
	
	public static void leggTilAnsatt(String brk, String fornvn, String etter) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		
		if (finnAnsattMedBrknavn(brk) == null && brk.length() < 5) {
			
			Ansatt ny = new Ansatt(brk,fornvn,etter);
			Database.leggTilAnsatt(ny);
			try {
			tx.begin();
			em.persist(ny);
			tx.commit();
		
		} catch (Throwable e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			em.close();
		}
		} else {
			System.out.println("Ugyldig/opptatt brukernavn");
		}
	}
	
}
