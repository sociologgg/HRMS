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
@Table(name= "experiences")
public class Experience {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "experience_id")
		private int id;
		
		@ManyToOne
		@JoinColumn(name = "jobseekerCv_id")
		private JobSeekerCv jobseekerCv;
		
		@Column(name = "company_name")
		private String companyName;
		
		@Column(name = "position")
		private String positionName;
		
		@Column(name="started_at")
		private LocalDate startedAt;
		
		@Column(name="finished_at",nullable = true)
		private LocalDate finishedAt;

		public Experience() {
			super();
		}

		public Experience(int id, JobSeekerCv jobseekerCv, String companyName, String positionName, LocalDate startedAt,
				LocalDate finishedAt) {
			super();
			this.id = id;
			this.jobseekerCv = jobseekerCv;
			this.companyName = companyName;
			this.positionName = positionName;
			this.startedAt = startedAt;
			this.finishedAt = finishedAt;
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

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getPositionName() {
			return positionName;
		}

		public void setPositionName(String positionName) {
			this.positionName = positionName;
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
		
		
}
