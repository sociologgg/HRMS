package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerCvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerCv;

@RestController
@RequestMapping("/api/jobseekercvs")
public class JobSeekerCvsController {

	private JobSeekerCvService jobSeekerCvService;
	
	@Autowired
	public JobSeekerCvsController(JobSeekerCvService jobSeekerCvService) {
		super();
		this.jobSeekerCvService = jobSeekerCvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeekerCv>> getAll() {
		return this.jobSeekerCvService.findAll();
	}
	@PostMapping("/add")
		public Result add(@RequestBody JobSeekerCv jobSeekerCv) {
			return this.jobSeekerCvService.add(jobSeekerCv);
		}

}
