package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ProfessionService;
import kodlamaio.hrms.dataAccess.abstracts.ProfessionDao;
import kodlamaio.hrms.entities.concretes.Profession;

@Service
public class ProfessionManager implements ProfessionService{

	private ProfessionDao professionDao;
	
	
	@Autowired
	public ProfessionManager(ProfessionDao professionDao) {
		super();
		this.professionDao = professionDao;
	}

	@Override
	public List<Profession> getAll() {
		// TODO Auto-generated method stub
		return this.professionDao.findAll();
	}

}
