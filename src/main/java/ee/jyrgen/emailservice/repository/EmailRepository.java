package ee.jyrgen.emailservice.repository;

import ee.jyrgen.emailservice.model.Email;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmailRepository extends CrudRepository<Email, Long>{
	@Query("select distinct address from Email")
	List<String> findDistinctAddress();
	List<Email> findByAddress(String address);
}
