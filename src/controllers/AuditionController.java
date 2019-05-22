package controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import data.*;
import services.AuditionService;

@SuppressWarnings("deprecation")
@ManagedBean
public class AuditionController {

	private Audition audition = new Audition();
	private int id = 0;
	private LocalDate date = LocalDate.MIN;
	private int max = 0;
	private Group group = null; 
	private Venue venue = null;
	private ArrayList<Judge> judges = new ArrayList<Judge>();
	
	public LocalDate getDate() {return date;}
	public void setDate(LocalDate ld) {date = ld; }
	
	public int getId() {return id;}
	public void setId(int m) { id = m;}
	
	public int getMax() {return max;}
	public void setMax(int m) { max = m;}
	
	public Group getGroup() {return group;}
	public void setGroup(Group g) { group = g;}
	
	public Venue getVenue() {return venue;}
	public void setVenue(Venue v) { venue = v;}
	
	public ArrayList<Judge> getJudges() {return judges;}
	public void setJudges( ArrayList<Judge> j) {judges = j;}
 	
	@EJB
	private AuditionService service;
	
	
	public void createAudition() {
		service.createAudition(audition);
	}
	
	public void deleteAudition() {
		service.removeAudition(id);
	}
	
	public void addGroup() {
		service.addGroup(id, group);
	}
	
}
