

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Local
public interface IAuditionService {
	public void createAudition(Audition a);
	public void removeAudition(int id);
}
