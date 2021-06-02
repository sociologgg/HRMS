package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "socials")
public class Social {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "social_id")
	private int id;
	
	@Column(name = "github_link")
	private String githubLink;
	
	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@ManyToOne
	@JoinColumn(name = "jobseekerCv_id")
	private JobSeekerCv jobseekerCv;

	public Social() {
		super();
	}

	public Social(int id, String githubLink, String linkedinLink, JobSeekerCv jobseekerCv) {
		super();
		this.id = id;
		this.githubLink = githubLink;
		this.linkedinLink = linkedinLink;
		this.jobseekerCv = jobseekerCv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getLinkedinLink() {
		return linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public JobSeekerCv getJobseekerCv() {
		return jobseekerCv;
	}

	public void setJobseekerCv(JobSeekerCv jobseekerCv) {
		this.jobseekerCv = jobseekerCv;
	}
	
}
