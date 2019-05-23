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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCompetition")
	private int _idCompetition;
	
	@Column(name = "DeadlineForApplication")
    private LocalDate _deadlineForApplication;

    public Competition() {
    	
    }
    
    public void setDeadline(LocalDate ld) { _deadlineForApplication = ld; }
    public LocalDate getDeadline() { return _deadlineForApplication; }
}