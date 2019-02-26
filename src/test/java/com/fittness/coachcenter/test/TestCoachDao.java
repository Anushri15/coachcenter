package com.fittness.coachcenter.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.fittness.coachcenter.dao.CoachDaoImpl;
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CoachDaoImpl.class})
@Import({CoachesConfig.class})
public class TestCoachDao {
	
	@Autowired
	CoachDaoImpl coachDaoImpl;
	
	@Test
    public void testGetAllCoaches() {
    	
		System.out.println(coachDaoImpl.getAllCoaches());
    	
   

    }

}
