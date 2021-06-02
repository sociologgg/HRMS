package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerCvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerCvDao;

import kodlamaio.hrms.entities.concretes.JobSeekerCv;
@Service
public class JobSeekerCvManager implements JobSeekerCvService {

	
	private JobSeekerCvDao jobSeekerCvDao;
	
	@Autowired
	public JobSeekerCvManager(JobSeekerCvDao jobSeekerCvDao) {
		super();
		this.jobSeekerCvDao = jobSeekerCvDao;
	}

	@Override
	public Result add(JobSeekerCv jobSeekerCv) {
		this.jobSeekerCvDao.save(jobSeekerCv);
		return  new SuccessResult("Cv başarıyla eklendi!");
	}

	@Override
	public DataResult<List<JobSeekerCv>> findAll() {
		
		return new SuccessDataResult<List<JobSeekerCv>>(this.jobSeekerCvDao.findAll(),"Tüm Cv'ler listelendi!");
	}

	
}
