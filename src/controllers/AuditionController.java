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
 	
	@EJB
	private IAuditionService service;
	
	
	public void createAudition() {
		audition.setDate(date);
		audition.setMaxNumberOfCandidates(max);
		service.createAudition(audition);
	}
	
	public void deleteAudition() {
		service.removeAudition(id);
	}
	
}
