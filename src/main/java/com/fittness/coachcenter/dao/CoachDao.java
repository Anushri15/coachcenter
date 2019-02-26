package com.fittness.coachcenter.dao;

import java.util.List;

import com.fittness.coachcenter.entity.Coaches;

public interface CoachDao {
	
	public List<Coaches> getAllCoaches();

	public Coaches save(Coaches coach);

	public Coaches updateCoach(Coaches coachRefNum);

	public int deleteCoach(int coachesId);

}
