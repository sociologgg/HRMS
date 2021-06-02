package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SocialService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialDao;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.concretes.Social;

@Service
public class SocialManager implements SocialService {

	private SocialDao socialDao;
	
	@Autowired
	public SocialManager(SocialDao socialDao) {
		super();
		this.socialDao = socialDao;
	}

	@Override
	public Result add(Social social) {
		this.socialDao.save(social);
		return new SuccessResult("Sosyal ağ başarıyla eklendi!");
	}

	@Override
	public DataResult<List<Social>> findAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Social>>(this.socialDao.findAll(),"Tüm Medya adresleri listelendi!");
	}

}
