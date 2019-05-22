package services;

import java.time.LocalDate;
import data.Competition;
import data.Candidate;

public interface ICompetitionService {

	public void createCompetition(Competition c);
	public void deleteCompetition(int id);
	public void applyCandidate(int id, Candidate cand);
	public void setDate(int id, LocalDate t);
}
