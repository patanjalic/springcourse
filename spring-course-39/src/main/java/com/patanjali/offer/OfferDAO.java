package com.patanjali.offer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("offerDao")
public class OfferDAO {

	private JdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	List<Offer> getOffers() {
		return jdbc.query("select * from offer", new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setEmail(rs.getString("email"));
				offer.setName(rs.getString("name"));
				offer.setText(rs.getString("text"));
				return offer;
			}
			
		});
	}
}
