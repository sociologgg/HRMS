package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Professions")

public class Profession {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;
	
	@Column(name = "ProfessionId")
	private  int ProfessionId;
	
	@Column(name = "ProfessionName")
	private String ProfessionName;
	
	public Profession() {}
	
	public Profession(int id, int professionId, String professionName) {
		super();
		this.id = id;
		ProfessionId = professionId;
		ProfessionName = professionName;
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
		return ProfessionName;
	}

	public void setProfessionName(String professionName) {
		ProfessionName = professionName;
	}
}
