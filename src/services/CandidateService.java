package services;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import data.Candidate;

@Stateless
@Local
public class CandidateService implements ICandidateService {

	@PersistenceContext(name = "AudicijaIS")
	private EntityManager em;
	
	
	@Override
	public void createCandidate(Candidate c) {
		em.persist(c);
	}

	@Override
	public void deleteCandidate(int id) {
		Candidate c = em.find(Candidate.class, id);
		em.remove(c);
	}

}
