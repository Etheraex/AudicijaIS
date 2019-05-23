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

    public Audition() {
    	
    }
    
    public Audition(int maxCandidates, LocalDate d) {
        _date = d;
        _maxNumberOfCandidates = maxCandidates;
    }

    public LocalDate getDate() {return _date;}
    public void setDate(LocalDate ld) { _date = ld; }
    
    public int getMaxNumberOfCandidates(){ return _maxNumberOfCandidates; }
    public void setMaxNumberOfCandidates(int x) { _maxNumberOfCandidates = x; }
    
}