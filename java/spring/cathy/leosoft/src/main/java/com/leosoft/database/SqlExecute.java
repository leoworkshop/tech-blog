package com.leosoft.leosoft.database;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SqlExecute {
	@Autowired
	private JdbcTemplate jdbc;
	
	@Bean
	public String create() {
		jdbc.update("DROP TABLE IF EXISTS test");
		jdbc.update("CREATE TABLE test (id SERIAL NOT NULL, title VARCHAR(20), sub VARCHAR(20), PRIMARY KEY(id))");

		return null;
	}
	
	@Bean
	public String insert() {
		String[][] data = {{"AAA","aaa"},{"BBB","bbb"},{"CCC","ccc"}};
		for (int i=0; i<data.length; i++) {
			jdbc.update("INSERT INTO test (title, sub) VALUES (?, ?)", data[i][0], data[i][1]);
		}

		return null;
	}
}