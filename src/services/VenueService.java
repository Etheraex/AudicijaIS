package services;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import data.Venue;

@Stateless
@Local
public class VenueService implements IVenueService {

	@PersistenceContext(name = "AudicijaIS")
	private EntityManager em;
	
	@Override
	public void addVenue(Venue v) {
		em.persist(v);
	}

	@Override
	public void removeVenue(int id) {
		Venue v = em.find(Venue.class,id);
		em.remove(v);
	}

	@Override
	public void editVenue(int id, String city) {
		Venue v = em.find(Venue.class,id);
		v.setCity(city);
		System.out.println("Promenili ste grad!");
	}

}
