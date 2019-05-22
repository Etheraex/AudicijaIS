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
    private int _idCandidate;
	
    private ArrayList<Integer> _grades = new ArrayList<Integer>();
    private ArrayList<String> _impressions = new ArrayList<String>();
    private String _email;
    private int _round;
    private Caretaker _caretaker;
    
    public Candidate(){
    	super();
    }
    
    public Candidate(String name,String surname, int age, int id, String email) {
        super(name,surname, age);
        _idCandidate = id;
        _email = email;
        _round = 1;
    }

    public void setGrade(int grade){
        _grades.add(grade);
    }

    public void setImpression(String impression){
        _impressions.add(impression);
    }

    public void sing(){
        System.out.println("Candidate: "+ ToString() +": "+ _idCandidate + " has started singing");
        System.out.println("Candidate: "+ ToString() +": "+ _idCandidate + " has finished singing");
    }

    public boolean passingGrade(){
        int sum = 0;
        for(int g : _grades)
            sum+=g;
        return (sum / _grades.size() > 8) ? true : false;
    }

    public void setRound(){
        _round++;
    }

    public int getId(){
        return _idCandidate;
    }

    public int getRound(){
        return _round;
    }

    public String getEmail(){
        return _email;
    }

    public void setCaretaker(Caretaker c){
        _caretaker = c;
    }
}