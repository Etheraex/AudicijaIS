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
	private int round = 0;
	
	public Candidate getCandidate() {return candidate;}
	public void setCandidate(Candidate c ) {candidate = c; } 
	
	public String getName() { return name; }
    public void setName(String n) { name = n; }
    
    public String getSurname() { return surname; }
    public void setSurname(String s) { surname = s; }

    public int getAge() { return age; }
    public void setAge(int a) { age = a; }
	
    public void setRound(){  round++; }
    public int getRound() { return round; }
    
    public int getId() { return id; }
    public void setId(int idp) {id = idp; }

    public String getEmail(){ return email; }
    public void setEmail(String e) { email = e; }
    
	@EJB
	private ICandidateService service;
	
	public void createCandidate(Candidate candidate) {
		service.createCandidate(candidate);
	}
	
	public void deleteCandidate() {
		service.deleteCandidate(id);
	}
	
}


/*
 <p:outputLabel value = "Id"/>
	<p:inputText value="#{candidateController.id}"></p:inputText>
	<p:commandButton value= "Obrisi" action="#{candidateController.deleteCandidate()}"></p:commandButton>	 
 */