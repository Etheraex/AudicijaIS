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
	private int _idAudition;
	
    private LocalDate _date;
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

    public void addJudge(Judge j) {
        _judges.add(j);
    }

    public void removeJudge(Judge j) {
        _judges.remove(j);
    }

    public ArrayList<Candidate> getPassingCandidates() {
        this.removeLosers();
        return _group.getCandidates();
    }

    public void removeLosers() {
        for (int i = _group.getNumberOfCandidates() - 1; i >= 0; i--) {
            Candidate tmp = _group.getCandidate(i);
            if (!tmp.passingGrade())
                _group.removeCandidate(tmp);
            else
                tmp.setRound();
        }
    }

    public int getMaxNumberOfCandidates(){
        return _maxNumberOfCandidates;
    }

    public void setGroup(Group g){
        _group = g;
    }
}