

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IdJudge")
	private int _idJudge;
	
	public Judge() {
		super();
	}
	
    public Judge(String name,String surname, int age) {
        super(name,surname, age);
    }
}