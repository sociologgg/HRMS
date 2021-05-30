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
@Table(name = "job_adverts")
public class JobAdt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_description")
	private String description;
	
	@Column(name ="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="applicantable_position_count")
	private int applicantablePositionCount;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="published_at")
	private LocalDate publishedAt;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="profession_id")
	private Profession profession; 
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getApplicantablePositionCount() {
		return applicantablePositionCount;
	}

	public void setApplicantablePositionCount(int applicantablePositionCount) {
		this.applicantablePositionCount = applicantablePositionCount;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public LocalDate getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDate publishedAt) {
		this.publishedAt = publishedAt;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public JobAdt() {
		super();
	}

	public JobAdt(int id, String description, int minSalary, int maxSalary, int applicantablePositionCount,
			LocalDate deadline, LocalDate publishedAt, boolean isActive, Profession profession, Employer employer,
			City city) {
		super();
		this.id = id;
		this.description = description;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.applicantablePositionCount = applicantablePositionCount;
		this.deadline = deadline;
		this.publishedAt = publishedAt;
		this.isActive = isActive;
		this.profession = profession;
		this.employer = employer;
		this.city = city;
	}
	
	
	
	
}
