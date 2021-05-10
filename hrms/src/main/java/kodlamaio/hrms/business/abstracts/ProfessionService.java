package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Profession;

public interface ProfessionService  {
	List<Profession> getAll();
}
