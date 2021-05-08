package comspringjdbc;

import javax.sql.DataSource;
import comspringjdbc.dao.studentDao;
import comspringjdbc.dao.studentDaoImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql//localhost:3305/springjdbc");
		ds.setUsername("root");
		ds.setPassword("mysql");
		return ds;
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	@Bean(name= {"studentDao"})
	public studentDao getStudentDao() {
		studentDaoImpl studentDao= new studentDaoImpl();
		return studentDao;
	}
}
