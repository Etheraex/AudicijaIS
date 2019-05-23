package data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name ="venue")
public class Venue{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdVenue")
	private int _idVenue;
	
	@Column(name = "City")
    private String _city;
	
	@Column(name = "Capacity")
    private int _capacity;

    public Venue(){
    	
    }
    
    public String getCity(){ return _city; }
    public void setCity(String c) { _city = c; }
    
    public void setCapacity(int c) { _capacity = c; }
    public int getCapacity(){ return _capacity; }
}