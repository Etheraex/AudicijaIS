package data;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "audition")
public class Audition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IdAudition")
	private int _idAudition;
	
	@Column(name = "date")
    private LocalDate _date;
	
	@Column(name = "maxNumberOfCandidates")
    private int _maxNumberOfCandidates;
	
    private ArrayList<Judge> _judges = new ArrayList<Judge>();
    private Group _group;
    private Venue _venue;

    public Audition() {
    	
    }
    
    public Audition(int maxCandidates, LocalDate d, Venue v) {
        _date = d;
        _maxNumberOfCandidates = maxCandidates;
        _venue = v;
    }

    public LocalDate getDate() {return _date;}
    public void setDate(LocalDate ld) { _date = ld; }

    public ArrayList<Judge> getJudges() {return _judges;}
    public void setJudges(ArrayList<Judge> jl) { _judges = jl; }
    
    public int getMaxNumberOfCandidates(){ return _maxNumberOfCandidates; }
    public void setMaxNumberOfCandidates(int x) { _maxNumberOfCandidates = x; }
    
    public void setVenue(Venue v ) { _venue = v; }
    public Venue getVenue() { return _venue; } 
    
    public void setGroup(Group g ) { _group = g; }
    public Group getGroup() { return _group; } 
    
}