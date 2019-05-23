package services;

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import data.Candidate;

@Local
public interface ICandidateService {
	public void createCandidate(Candidate c);
	public void deleteCandidate(int id);
	public void editCandidate(String email, int id);
}
