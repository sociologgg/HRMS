package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.validations.abstracts.EmailValidationService;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private UserDao userDao;
	@Autowired
	private EmailValidationService eMailValidationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,UserDao userDao,EmailValidationService eMailValidationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.userDao = userDao;
		this.eMailValidationService = eMailValidationService;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if (jobSeeker.getEmail() == null
			|| jobSeeker.getPassword() == null
			|| jobSeeker.getPasswordRepeat() == null
			|| jobSeeker.getCreatedDate() == null
			|| jobSeeker.getFirstName() == null
			|| jobSeeker.getLastName() == null
			|| jobSeeker.getIdentityNumber() == null
			|| jobSeeker.getBirthDate() == null) {
			
			return new ErrorResult("Tüm alanları doldurmanız gerekmektedir!");
		}
		
		else if (!jobSeeker.getPassword().equals(jobSeeker.getPasswordRepeat())) {
			return new ErrorResult("Şifre doğrulaması yanlış!");
		}
		else if (userDao.findByemail(jobSeeker.getEmail()) != null) {
			return new ErrorResult("Email halihazırda kullanılmaktadır!");
			
		}
		else if (jobSeekerDao.findByidentityNumber(jobSeeker.getIdentityNumber()) != null) {
			return new ErrorResult("Tc No halihazırda sisteme kayıtlıdır!");
		}
		else {
			
			if( eMailValidationService.sendMail(jobSeeker) ) {
				jobSeekerDao.save(jobSeeker);
				return new SuccessResult("İş Arayan Kullanıcı eklendi. ");
			}
			else {
				return new ErrorResult("Email doğrulaması hatalı!");
			}
			
		}
	}
	
	
	
}
