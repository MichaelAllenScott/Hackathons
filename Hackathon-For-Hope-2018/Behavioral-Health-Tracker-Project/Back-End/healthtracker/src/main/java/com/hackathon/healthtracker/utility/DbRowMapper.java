package com.hackathon.healthtracker.utility;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.hackathon.healthtracker.model.patient; 

public class DbRowMapper implements RowMapper<patient> {

	@Override
	public patient mapRow(ResultSet row, int rowNum) throws SQLException {
		patient myPatient = new patient();
		myPatient.setId(row.getLong("patient_id"));
		myPatient.setUsername(row.getString("username"));
		return myPatient;
	}
	
}
