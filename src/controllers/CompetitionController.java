package controllers;

import java.time.LocalDate;
import data.Candidate;
import data.Competition;
import services.CompetitionService;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@SuppressWarnings("deprecation")
@ManagedBean
public class CompetitionController {

	private Competition competition = new Competition();
	private int id = 0;
	private LocalDate deadline = LocalDate.MIN;
	
	@EJB
	private CompetitionService service;
	
	public void setId(int i) { id = i; }
	public int getId() {return id;}
	
	public void setDeadline(LocalDate d) { deadline = d; }
	public LocalDate getDeadline() { return deadline; }
	
	public Competition getCompetition() { return competition; } 
	public void setCompetition(Competition c) { competition = c; } 
	
	public void createCompetition() {
		service.createCompetition(competition);
	}
	
	public void deleteCompetition() {
		service.deleteCompetition(id);
	}
	
	public void applyCandidate(String name, String surname, int age, int id, String email) {
		Candidate cand = new Candidate(name, surname,age, id, email);
		service.applyCandidate(id, cand);
	}
	
	public void setDate() {
		service.setDate(id, deadline);
	}
 	
}