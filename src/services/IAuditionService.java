package services;


import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import data.Audition;

@Local
public interface IAuditionService {
	public void createAudition(Audition a);
	public void removeAudition(int id);
}
