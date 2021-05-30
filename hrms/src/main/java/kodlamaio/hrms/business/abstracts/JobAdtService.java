package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdt;

public interface JobAdtService {

	
	Result add(JobAdt jobAdvert);
	Result delete(int id);
	Result update(JobAdt jobAdvert);
	Result deactivateAdvert(int id);
	
	DataResult<JobAdt> getById(int id);
	DataResult<List<JobAdt>> getAll();
	DataResult<List<JobAdt>> getAllActiveJobAdvertList();
	DataResult<List<JobAdt>> findAllByOrderByPublishedAtDesc();
	DataResult<List<JobAdt>> getAllActiveJobAdvertByEmployer(int id);
	
}
