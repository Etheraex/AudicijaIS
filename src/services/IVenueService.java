package services;

import data.Venue;

public interface IVenueService {
	public void addVenue(Venue v);
	public void removeVenue(int id);
	public void editVenue(int id, String city);
}
