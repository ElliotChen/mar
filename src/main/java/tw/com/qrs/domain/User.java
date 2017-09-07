package tw.com.qrs.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "T_USER")
public class User {
	@Id
	@Column(name = "oid", length = 32)
	@GenericGenerator(name="uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String id;
}
