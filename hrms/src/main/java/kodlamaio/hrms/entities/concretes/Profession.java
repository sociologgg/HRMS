package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Professions")

public class Profession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	@Column(name = "ProfessionId")
	private  int ProfessionId;
	
	@Column(name = "ProfessionName", unique = true)
	private String professionName;
	
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
