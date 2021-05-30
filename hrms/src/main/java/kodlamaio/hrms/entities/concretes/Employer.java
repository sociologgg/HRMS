package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name="userid", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class Employer extends User{

	@Id
	@Column(name="UserID")
	private int id;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebSite")
	private String webSite;
	
	@Column(name="Phone")
	private String phone;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdt> jobAdverts;
	
	public Employer() {}

	public Employer(int id, String companyName, String webSite, String phone) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webSite = webSite;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
