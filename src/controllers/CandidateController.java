package controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import data.Candidate;
import services.ICandidateService;

@SuppressWarnings("deprecation")
@ManagedBean
public class CandidateController {

	private Candidate candidate = new Candidate();
	private int id = 2;
	private String name = "";
	private String surname = "";
	private String email = "";
	private int age = 0;
	
	public Candidate getCandidate() {return candidate;}
	public void setCandidate(Candidate c ) {candidate = c; } 
	
	public String getName() { return name; }
    public void setName(String n) { name = n; }
    
    public String getSurname() { return surname; }
    public void setSurname(String s) { surname = s; }

    public int getAge() { return age; }
    public void setAge(int a) { age = a; }
    
    public int getId() { return id; }
    public void setId(int idp) {id = idp; }

    public String getEmail(){ return email; }
    public void setEmail(String e) { email = e; }
    
	@EJB
	private ICandidateService service;
	
	public void createCandidate() {
		candidate.setAge(age);
		candidate.setEmail(email);
		candidate.setName(name);
		candidate.setSurname(surname);
		candidate.setRound();
		service.createCandidate(candidate);
	}
	
	public void deleteCandidate() {
		service.deleteCandidate(id);
	}
	
	public void updateCandidate() {
		service.editCandidate(email,id);
	}
	
}