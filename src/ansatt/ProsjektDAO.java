package ansatt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProsjektDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("oblig");

	public Prosjekt finnProsjektMedId(int id) {

		EntityManager em = emf.createEntityManager();

		try {
			return em.find(Prosjekt.class, id);
		} finally {

			em.close();

		}

	}

}
