package tw.com.qrs.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestObject {
	@Id
	private String id;

	private String name;
}
