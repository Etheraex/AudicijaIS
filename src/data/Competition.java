package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "competition")
public class Competition {
	
	@Id
	private int _idCompetition;
	
    private LocalDate _deadlineForApplication;
    private ArrayList<Candidate> _candidates = new ArrayList<Candidate>();
    private ArrayList<Audition> _auditions = new ArrayList<Audition>();

    public Competition() {
    	
    }
    
    public Competition(LocalDate d) {
        _deadlineForApplication = d;
    }

    public void removeAudition(Audition a) {
        _auditions.remove(a);
    }

    public void apply(Candidate c) {
        _candidates.add(c);
    }

    public void createGroups() {
        int lowerBorder = 0;
        for (int i = 0; i < _auditions.size(); i++) {
            ArrayList<Candidate> tmp = new ArrayList<Candidate>();
            for (int j = lowerBorder; j < lowerBorder + _auditions.get(i).getMaxNumberOfCandidates(); j++) {
                tmp.add(_candidates.get(j));
                lowerBorder += _auditions.get(i).getMaxNumberOfCandidates();
            }
            Group g = new Group(tmp);
            _auditions.get(i).setGroup(g);
        }
    }

    public void newRound(){
        _candidates = null;
        for(int i = 0;i<_auditions.size();i++)
            _candidates.addAll(_auditions.get(i).getPassingCandidates());
        // Audicije su samo za jednu rundu
        // Pre pocetka nove runde moraju se zakazati nove audicije
        _auditions = null;
    }
}