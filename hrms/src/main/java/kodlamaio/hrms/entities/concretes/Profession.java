package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Professions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})

public class Profession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "ProfessionId")
	private  int ProfessionId;
	
	@Column(name = "ProfessionName", unique = true)
	private String professionName;
	
	@OneToMany(mappedBy = "profession")
	private List<JobAdt> jobAdverts;
	
	public Profession() {}
	
	public Profession(int id, int professionId, String professionName) {
		super();
		this.id = id;
		this.ProfessionId = professionId;
		this.professionName = professionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProfessionId() {
		return ProfessionId;
	}

	public void setProfessionId(int professionId) {
		ProfessionId = professionId;
	}

	public String getProfessionName() {
		return professionName;
	}

	public void setProfessionName(String professionName) {
		this.professionName = professionName;
	}
}
