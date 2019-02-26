package com.fittness.coachcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fittness.coachcenter.dao.CoachDao;
import com.fittness.coachcenter.entity.Coaches;

@Service
public class CoachServiceImpl implements CoachService {
	@Autowired
	private CoachDao coachDao;

	@Override
	public List<Coaches> getAllCoaches() {
		return coachDao.getAllCoaches();
	}

	@Transactional
	@Override
	public Coaches save(Coaches coach) {
		Coaches theCoaces = coachDao.save(coach);

		return theCoaces;
	}
	@Transactional
	@Override
	public Coaches updateCoach(Coaches coach) {
		Coaches theCoach = coachDao.updateCoach(coach);
		return theCoach;
	}

	@Override
	public int deleteCoach(int coachesId) {
		int coacId = coachDao.deleteCoach(coachesId);
		return coacId;
	}

}
