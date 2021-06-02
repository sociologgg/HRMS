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
@Table(name = "techskills")
public class TechSkill {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "techskill_id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@ManyToOne
	@JoinColumn(name = "jobseekerCv_id")
	private JobSeekerCv jobseekerCv;

	public TechSkill() {
		super();
	}

	public TechSkill(int id, String skillName, JobSeekerCv jobseekerCv) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.jobseekerCv = jobseekerCv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public JobSeekerCv getJobseekerCv() {
		return jobseekerCv;
	}

	public void setJobseekerCv(JobSeekerCv jobseekerCv) {
		this.jobseekerCv = jobseekerCv;
	}
}
