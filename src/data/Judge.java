package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="judge")
public class Judge extends Person{

	@Id
	private int _idJudge;
	
	public Judge() {
		super();
	}
	
    public Judge(String name,String surname, int age) {
        super(name,surname, age);
    }

    public void giveGrade(Candidate c, int grade){
        c.setGrade(grade);
    }

    public void giveImpression(Candidate c, String impression){
        c.setImpression(impression);
    }
}