package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdt;

public interface JobAdtDao extends JpaRepository<JobAdt, Integer> {

	@Query("From JobAdt where isActive = true")
	List<JobAdt> getAllActiveJobAdvertList();
	
	@Query("From JobAdt where isActive = true Order By publishedAt Desc")
	List<JobAdt> findAllByOrderByPublishedAtDesc();
	
	@Query("From JobAdt where isActive = true and employer_id =: id")
	List<JobAdt> getAllActiveJobAdvertByEmployer(int id);
	
}
