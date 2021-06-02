package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SocialService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.Social;

@RestController
@RequestMapping("/api/socials")
public class SocialsController {

	private SocialService socialService;
	
	@Autowired
	public SocialsController(SocialService socialService) {
		super();
		this.socialService = socialService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Social>> getAll() {
		return this.socialService.findAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Social social) {
		return this.socialService.add(social);
	}
	
	
}
