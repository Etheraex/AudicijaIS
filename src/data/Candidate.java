package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import java.util.ArrayList;

@Entity
@Table(name = "candidate")
public class Candidate extends Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IdCandidate")
    private int _idCandidate;
	
    private ArrayList<Integer> _grades = new ArrayList<Integer>();
    private ArrayList<String> _impressions = new ArrayList<String>();
    
    @Column(name = "Email")
    private String _email;
    
    @Column(name = "Round")
    private int _round;
    
    public Candidate(){
    	super();
    }
    
    public Candidate(String name,String surname, int age, int id, String email) {
        super(name,surname, age);
        _idCandidate = id;
        _email = email;
        _round = 1;
    }

    public void setGrades(ArrayList<Integer> gr){ _grades = gr; }
    public ArrayList<Integer> getGrades() { return _grades; }
    
    public void setImpressions(ArrayList<String> imp){ _impressions = imp; }
    public ArrayList<String> getImpressions() { return _impressions; }
    
    public void setRound(){  _round++; }
    public int getRound() { return _round; }
    
    public int getId() { return _idCandidate; }

    public String getEmail(){ return _email; }
    public void setEmail(String e) { _email = e; }
}