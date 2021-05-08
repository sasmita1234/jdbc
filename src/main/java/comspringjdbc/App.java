package comspringjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import comspringjdbc.dao.studentDao;
import comspringjdbc.entities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started..........." );
        //spring jdbc => JdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("comspringjdbc/config.xml");
        
      studentDao sdo=context.getBean("studentDao",studentDao.class);
      student std = new student();
      std.setId(666);
      std.setCity("Lucknow");
      std.setName("John");
      
      int result = sdo.insert(std);
      System.out.println("student added" +result);
    }
}

