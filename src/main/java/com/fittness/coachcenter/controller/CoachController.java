package com.fittness.coachcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fittness.coachcenter.entity.Coaches;
import com.fittness.coachcenter.service.CoachService;

@RestController
@RequestMapping("/fittness")
public class CoachController {

	@Autowired
	private CoachService coachService;

	@GetMapping("/coaches")
	public List<Coaches> getAllCoaches() {
		return coachService.getAllCoaches();
	}

	@PostMapping("/coaches")
	public int addCoach(@RequestParam Coaches coach) {
		Coaches theCoach = coachService.save(coach);
		return theCoach.getCoachRefNum();
	}

	@PutMapping("/coaches/")
	public Coaches updateCoach(@RequestParam Coaches coach) {
		Coaches theCoach = coachService.updateCoach(coach);
		return theCoach;
	}

	@DeleteMapping("/coaches/{customerId}")
	public int deleteCoach(@PathVariable int coachId) {
		int coachesId = coachId;
		 coachService.deleteCoach(coachesId);
		 return coachesId;
	}

}
