package services;

import java.time.LocalDate;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import data.Candidate;
import data.Competition;

@Stateless
public class CompetitionService implements ICompetitionService {
	
	@PersistenceContext(name = "AudicijaIS")
	private EntityManager em;
	
	@Override
	public void createCompetition(Competition c) {
		em.persist(c);
	}

	@Override
	public void deleteCompetition(int id) {
		Competition c = em.find(Competition.class, id);
		em.remove(c);
	}

	@Override
	public void applyCandidate(int id, Candidate cand) {
		Competition c = em.find(Competition.class, id);
		c.addCandidate(cand);
	}

	@Override
	public void setDate(int id, LocalDate t) {
		Competition c = em.find(Competition.class, id);
		c.setDeadline(t);
		System.out.println("Promenili ste rok");
	}

}
