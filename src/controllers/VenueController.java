package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import data.Venue;
import services.IVenueService;

@SuppressWarnings("deprecation")
@ManagedBean
public class VenueController{
	private Venue venue = new Venue();
	private String city = "";
	private int capacity = 0;
	private int id = 0;
	
	@EJB
	private IVenueService service;
	
	public Venue getVenue() {return venue;}
	public void setVenue(Venue v) { venue = v;}
	
	public int getId() { return id; }
	public void setId(int i) { id = i; }
	
	public int getCapacity() {return capacity;}
	public void setCapacity(int c) {capacity = c; }
	
	public String getCity() {return city;}
	public void setCity(String c) {city = c;}
	
	public void saveVenue(Venue venue) {
		service.addVenue(venue);
	}
	
	public void removeVenue() {
		service.removeVenue(id);
	}
	
	public void editVenue() {
		service.editVenue(id, city);
	}
}

/*	<!--  <p:outputLabel value = "Id"/>
<p:inputText value="#{venueController.id}"></p:inputText>
<p:commandButton value= "Obrisi" action="#{venueController.removeVenue()}"></p:commandButton> -->
*/