package com.fittness.coachcenter.dao;

import java.sql.SQLClientInfoException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fittness.coachcenter.entity.Coaches;

@Repository
public class CoachDaoImpl implements CoachDao {

	private JdbcTemplate jdbcTemplate;

	public CoachDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Coaches> getAllCoaches() {

		List<Coaches> coaches = jdbcTemplate.query("SELECT * from Coaches ",
				(rs, rowNum) -> new Coaches(rs.getInt("REFERENCEID"), rs.getString("NAME"), rs.getInt("CONTACTNUMBER"),
						rs.getString("EMAILID")));

		return coaches;
	}

	@Override
	public Coaches save(Coaches coach) {

	jdbcTemplate.update("INSERT INTO COACHES(REFERENCEID, NAME, CONTACTNUMBER, EMAILID) VALUES (?,?,?,?)", new Object[] {
				coach.getCoachRefNum(), coach.getCoachName(), coach.getCoachContactNumber(), coach.getCoachEmailId() });
		return coach;
	}

	@Override
	public Coaches updateCoach(Coaches coach) {
	
		this.jdbcTemplate.update("UPDATE COACHES(NAME, CONTACTNUMBER, EMAILID set  NAME = ?, CONTACTNUMBER = ? ,EMAILID = ? WHERE REFERENCEID = ?", new Object[] {
				 coach.getCoachName(), coach.getCoachContactNumber(), coach.getCoachEmailId(),coach.getCoachRefNum() });

		return coach;
	}

	@Override
	public int deleteCoach(int coachesId) {
		this.jdbcTemplate.update("DELETE FROM COACHES WHERE REFERENCEID = ?", new Object[] {
				coachesId });

		return coachesId;
	}

}
