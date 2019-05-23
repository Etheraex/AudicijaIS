
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import java.util.ArrayList;


@Entity
@Table(name = "group")
public class Group {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IdGroup")
	private int _idGroup;
	
	public Group() {
		super();
	}
	
    private ArrayList<Candidate> _candidates = new ArrayList<Candidate>();

    public Group(ArrayList<Candidate> list){
        _candidates = list;
    }

    public ArrayList<Candidate> getCandidates(){
        return _candidates;
    }

    public void addCandidate(Candidate c){
        _candidates.add(c);
    }

    public void removeCandidate(Candidate c){
        _candidates.remove(c);
    }

    public Candidate getCandidate(int i){
        return _candidates.get(i);
    }

    public int getNumberOfCandidates(){
        return _candidates.size();
    }
}