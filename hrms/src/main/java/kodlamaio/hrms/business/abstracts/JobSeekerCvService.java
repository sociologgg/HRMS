package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerCv;

public interface JobSeekerCvService {

	Result add(JobSeekerCv jobSeekerCv);
	DataResult<List<JobSeekerCv>> findAll();
		
}
