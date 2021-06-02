package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "languages")
public class Language {

		@Id
		@GeneratedValue
		@Column(name = "language_id")
		private int id;
		
		@ManyToOne
		@JoinColumn(name = "jobseekerCv_id")
		private JobSeekerCv jobseekerCv;
		
		@Column(name = "language_name")
		private String languageName;
		
		
		@Column(name = "language_level")
		private int languageLevel;


		public Language() {
			super();
		}


		public Language(int id, JobSeekerCv jobseekerCv, String languageName, int languageLevel) {
			super();
			this.id = id;
			this.jobseekerCv = jobseekerCv;
			this.languageName = languageName;
			this.languageLevel = languageLevel;
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


		public String getLanguageName() {
			return languageName;
		}


		public void setLanguageName(String languageName) {
			this.languageName = languageName;
		}


		public int getLanguageLevel() {
			return languageLevel;
		}


		public void setLanguageLevel(int languageLevel) {
			this.languageLevel = languageLevel;
		}
	
}
