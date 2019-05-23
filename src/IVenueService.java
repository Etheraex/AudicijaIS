import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Local
public interface IVenueService {
	public void addVenue(Venue v);
	public void removeVenue(int id);
	public void editVenue(int id, String city);
}