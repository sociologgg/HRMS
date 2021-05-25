package kodlamaio.hrms.core.utilities.validations.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface EmailValidationService {
	public boolean sendMail(User user);
}
