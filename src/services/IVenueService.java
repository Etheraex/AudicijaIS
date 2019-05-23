package services;
import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import data.Venue;

@Local
public interface IVenueService {
	public void addVenue(Venue v);
	public void removeVenue(int id);
	public void editVenue(int id, int capacity);
}