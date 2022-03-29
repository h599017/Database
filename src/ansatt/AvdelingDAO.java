package ansatt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AvdelingDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("oblig");

	public Avdeling finnAvdelingMedId(int id) {

		EntityManager em = emf.createEntityManager();

		try {
			return em.find(Avdeling.class, id);
		} finally {
			em.close();
		}

	}

}
