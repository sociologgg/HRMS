package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdtService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdtDao;
import kodlamaio.hrms.entities.concretes.JobAdt;

@Service
public class JobAdtManager implements JobAdtService{

	private JobAdtDao jobAdtDao;
	
	@Autowired
	public JobAdtManager(JobAdtDao jobAdtDao) {
		super();
		this.jobAdtDao = jobAdtDao;
	}


	private boolean CheckIfNull(JobAdt jobAdt) {
		if (jobAdt.getProfession() != null 
			&& jobAdt.getDescription() != null
			&& jobAdt.getCity() != null
			&& jobAdt.getApplicantablePositionCount() != 0) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public Result add(JobAdt jobAdt) {
		if(!CheckIfNull(jobAdt)) {
			return new ErrorResult("Eksik alanları lütfen doldurunuz!");
		}
		this.jobAdtDao.save(jobAdt);
		return new SuccessResult("İş ilanı eklendi!") ;
	}
	
	@Override
	public Result update(JobAdt jobAdvert) {
		// TODO Auto-generated method stub
		this.jobAdtDao.save(jobAdvert);
		return new SuccessResult("İş ilanı güncellendi!");
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		this.jobAdtDao.deleteById(id);
		return new SuccessResult("İş ilanı silindi");
	}

	@Override
	public Result deactivateAdvert(int id) {
		if (getById(id) == null) {
			return new ErrorResult("Böyle bir ilan yok!");

		}
		if (getById(id).getData().isActive() == false) {
			return new ErrorResult("İş ilanı zaten kapalı!");
		}

		JobAdt jobAdvert = getById(id).getData();
		jobAdvert.setActive(false);
		
		update(jobAdvert);
		return new SuccessResult("İş ilanı başarıyla kapatıldı.");
	
	}

	@Override
	public DataResult<JobAdt> getById(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobAdt>(this.jobAdtDao.getOne(id));
	}

	@Override
	public DataResult<List<JobAdt>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdt>>(this.jobAdtDao.findAll());
	}

	@Override
	public DataResult<List<JobAdt>> getAllActiveJobAdvertList() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdt>>(this.jobAdtDao.getAllActiveJobAdvertList());
	}

	@Override
	public DataResult<List<JobAdt>> findAllByOrderByPublishedAtDesc() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdt>>(this.jobAdtDao.findAllByOrderByPublishedAtDesc());
	}

	@Override
	public DataResult<List<JobAdt>> getAllActiveJobAdvertByEmployer(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdt>>(this.jobAdtDao.getAllActiveJobAdvertByEmployer(id));
	}


	

}
