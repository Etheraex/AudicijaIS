package controllers;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import data.Audition;
import data.Group;
import data.Judge;
import data.Venue;
import services.IAuditionService;

@SuppressWarnings("deprecation")
@ManagedBean
public class AuditionController {

	private Audition audition = new Audition();
	private int id = 0;
	private String date = "";
	private int max = 0;
	private Group group = null; 
	private Venue venue = null;
	private ArrayList<Judge> judges = new ArrayList<Judge>();
	
	public String getDate() {return date;}
	public void setDate(String ld) {date = ld; }
	
	public void setAudition(Audition a) {
		audition = a;
	}
	
	public Audition getAudition() {
		return audition;
	}
	
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
	private IAuditionService service;
	
	
	public void createAudition(Audition audition) {
		service.createAudition(audition);
	}
	
	public void deleteAudition(int id) {
		service.removeAudition(id);
	}
	
}
