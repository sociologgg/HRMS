package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "educations")
public class Education {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="education_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "jobseekerCv_id")
	private JobSeekerCv jobseekerCv;
	
	@Column
	private String universityName;
	
	@Column
	private String departmentName;

	@Column(name="started_at")
	private LocalDate startedAt;
	
	@Column(name="finished_at")
	private LocalDate finishedAt;
	
	@Column(name="graduated_at")
	private LocalDate graduated_at;

	public Education() {
		super();
	}

	public Education(int id, JobSeekerCv jobseekerCv, String universityName, String departmentName, LocalDate startedAt,
			LocalDate finishedAt, LocalDate graduated_at) {
		super();
		this.id = id;
		this.jobseekerCv = jobseekerCv;
		this.universityName = universityName;
		this.departmentName = departmentName;
		this.startedAt = startedAt;
		this.finishedAt = finishedAt;
		this.graduated_at = graduated_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobSeekerCv getJobseekerCv() {
		return jobseekerCv;
	}

	public void setJobseekerCv(JobSeekerCv jobseekerCv) {
		this.jobseekerCv = jobseekerCv;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public LocalDate getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(LocalDate startedAt) {
		this.startedAt = startedAt;
	}

	public LocalDate getFinishedAt() {
		return finishedAt;
	}

	public void setFinishedAt(LocalDate finishedAt) {
		this.finishedAt = finishedAt;
	}

	public LocalDate getGraduated_at() {
		return graduated_at;
	}

	public void setGraduated_at(LocalDate graduated_at) {
		this.graduated_at = graduated_at;
	}
	
}
