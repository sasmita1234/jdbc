package comspringjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import comspringjdbc.entities.student;

public class studentDaoImpl implements studentDao{
private JdbcTemplate jdbcTemplate;
public int insert(student stud) {
	//insert query
	String query = "insert into student(id,name,city) values(?,?,?)";
int r=	this.jdbcTemplate.update(query,stud.getId(),stud.getName(),stud.getCity());
	
	
	return r;
}
public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate = jdbcTemplate;
	}
}
