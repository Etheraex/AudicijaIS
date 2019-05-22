package services;

import data.Audition;
import data.Group;


public interface IAuditionService {
	public void createAudition(Audition a);
	public void removeAudition(int id);
	public void addGroup(int id,Group g);
}
