package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemWorker;

public interface SystemWorkerDao extends JpaRepository<SystemWorker,Integer> {

}
