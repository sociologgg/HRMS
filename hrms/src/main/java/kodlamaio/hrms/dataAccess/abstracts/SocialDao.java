package kodlamaio.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Social;

public interface SocialDao extends JpaRepository<Social,Integer>{

}
