package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity()
@Table(name="systemworkers")
@PrimaryKeyJoinColumn(name = "userid", referencedColumnName = "id")
public class SystemWorker {

	@Id
	@Column(name = "UserID")
	private int id;
	
	public SystemWorker() {}

	public SystemWorker(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
