package tw.com.qrs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class InitTest {
	private static final Logger logger = LoggerFactory.getLogger(InitTest.class);


	@Autowired
	private DataSource dataSource;


	@Test
	public void testSelect() {
		try {
			Connection connection = this.dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
