package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdtService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdt;
import kodlamaio.hrms.core.utilities.results.DataResult;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdtsController {

	private JobAdtService jobAdtService;

	public JobAdtsController(JobAdtService jobAdtService) {
		super();
		this.jobAdtService = jobAdtService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdt jobAdt) {
		return this.jobAdtService.add(jobAdt);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdt>> getAll() {
		return this.jobAdtService.getAll();
	}
	
	
	// error veriyor
	@PostMapping("/deactivatejobAdt")
	public Result deactivateAdvert(int id) {
		return this.deactivateAdvert(id);
	}
	
	@GetMapping("/getAllActiveJobAdvertList")
	public DataResult<List<JobAdt>> getAllActiveJobAdvertList(){
		return this.jobAdtService.getAllActiveJobAdvertList();
	}
	
	@GetMapping("/findAllByOrderByPublishedAt")
	public DataResult<List<JobAdt>> findAllByOrderByPublishedAtDesc(){
		return this.jobAdtService.findAllByOrderByPublishedAtDesc();
	}
	@GetMapping("/getAllActiveJobAdvertByEmployer")
	public DataResult<List<JobAdt>> getAllOpenJobAdvertByEmployer(int id){
		return this.jobAdtService.getAllActiveJobAdvertByEmployer(id);
	}
	
	
}
