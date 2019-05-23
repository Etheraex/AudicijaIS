package services;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import data.Audition;

@Stateless
@Local
public class AuditionService implements IAuditionService {

	@PersistenceContext(name = "AudicijaIS")
	private EntityManager em;
	
	@Override
	public void createAudition(Audition a) {
		em.persist(a);
	}

	@Override
	public void removeAudition(int id) {
		Audition a = em.find(Audition.class, id);
		em.remove(a);
	}
}
