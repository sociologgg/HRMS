package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cvs")
public class JobSeekerCv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int id;
	
	@Column(name = "image_url")
	private String ImageUrl;
	
	@ManyToOne
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobseeker;
	
	@OneToMany(mappedBy = "jobseekerCv")
	private List<Education> educations;
	
	@OneToMany(mappedBy = "jobseekerCv")
	private List<Experience> experiences;

	@OneToMany(mappedBy = "jobseekerCv")
	private List<Language> languages;
	
	@OneToMany(mappedBy = "jobseekerCv")
	private List<Social> socials;
	
	@OneToMany(mappedBy = "jobseekerCv")
	private List<TechSkill> techSkills;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobSeeker getJobSeeker() {
		return jobseeker;
	}

	public void setJobSeeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public JobSeekerCv() {
		super();
	}

	public JobSeekerCv(int id,String ImageUrl, JobSeeker jobseeker) {
		super();
		this.ImageUrl = ImageUrl;
		this.id = id;
		this.jobseeker = jobseeker;
	}
	
	
}
