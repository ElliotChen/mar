package tw.com.qrs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.com.qrs.domain.TestObject;

import java.util.List;

public interface TestObjectRepository extends JpaRepository<TestObject, String> {

	public List<TestObject> findByName(String name);
}
