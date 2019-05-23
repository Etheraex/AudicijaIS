package controllers;

import java.time.LocalDate;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import data.Competition;
import services.ICompetitionService;

@SuppressWarnings("deprecation")
@ManagedBean
public class CompetitionController{

	private Competition competition = new Competition();
	private int id = 0;
	private String deadline = "";
	
	
	@EJB
	private ICompetitionService service;
	
	public void setId(int i) { id = i; }
	public int getId() {return id;}
	
	public void setDeadline(String d) { deadline = d; }
	public String getDeadline() { return deadline; }
	
	public Competition getCompetition() { return competition; } 
	public void setCompetition(Competition c) { competition = c; } 
	
	public void createCompetition(Competition competition) {
		service.createCompetition(competition);
	}
	
	public void deleteCompetition(int id) {
		service.deleteCompetition(id);
	}
	
	public void setDate(int id, String deadline) {
		service.setDate(id, deadline);
	}
 	
}