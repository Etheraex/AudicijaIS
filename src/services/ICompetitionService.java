package services;

import java.time.LocalDate;

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import data.Competition;

@Local
public interface ICompetitionService {

	public void createCompetition(Competition c);
	public void deleteCompetition(int id);
	public void setDate(int id, String t);
}
