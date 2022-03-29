package ansatt;

public class Main {

	public static void main(String[] args) {
		
		
		AnsattDAO.leggTilAnsatt("kfm", "kristoffer", "madsen");
		
//		final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ansattPersistenceUnit");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		em.persist(kfm);
//		tx.commit();
	}

}
