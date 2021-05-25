package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.validations.abstracts.EmailValidationService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	private UserDao userDao;
	@Autowired
	private EmailValidationService eMailValidationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, UserDao userDao, EmailValidationService eMailValidationService) {
		super();
		this.employerDao = employerDao;
		this.userDao = userDao;
		this.eMailValidationService = eMailValidationService;
	}
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>> 
		(this.employerDao.findAll(),"Data Listelendi");
		
	}
	@Override
	public Result add(Employer employer) {
		// Kontroller
		
		if(employer.getEmail() == null
				|| employer.getPassword() == null
				|| employer.getPasswordRepeat() == null
				|| employer.getCreatedDate() == null
				|| employer.getCompanyName() == null
				|| employer.getWebSite() == null
				|| employer.getPhone() == null) {
			return new ErrorResult("Tüm alanlar gereklidir!");
		}
		
		else if (!employer.getPassword().equals(employer.getPasswordRepeat())) {
			return new ErrorResult("Şifre doğrulaması hatalı!");
			
		}
		
		else if (!employer.getEmail().contains("@"+ employer.getEmail().substring(employer.getEmail().indexOf("@")+1))) {
			return new ErrorResult("Aynı domaine sahip mail adresi kullanılmaktadır.");
			
		}
		
		else if ( userDao.findByemail(employer.getEmail()) != null) {
			return new ErrorResult("Mail adresi kullanımda!");
		}
		
		else {
			
			if(eMailValidationService.sendMail(employer)) {
				employerDao.save(employer);
				return new SuccessResult("İşveren sisteme başarılı bir şekilde kaydedildi!");
				
			}
			else {
				return new ErrorResult("Email doğrulaması hatalı!");
			}
			
			
		}
		
	}



}
