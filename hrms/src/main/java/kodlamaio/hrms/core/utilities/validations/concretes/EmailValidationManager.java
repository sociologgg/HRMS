package kodlamaio.hrms.core.utilities.validations.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.validations.abstracts.EmailValidationService;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class EmailValidationManager implements EmailValidationService {
	public boolean sendMail(User user) {
		return true;
		
	}
}
