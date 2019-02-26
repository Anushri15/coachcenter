package com.fittness.coachcenter.service;

import java.util.List;

import com.fittness.coachcenter.entity.Coaches;

public interface CoachService {
	
	public List<Coaches> getAllCoaches();

	public Coaches save(Coaches coach);

	public Coaches updateCoach(Coaches coach);

	public int deleteCoach(int coachesId);

}
