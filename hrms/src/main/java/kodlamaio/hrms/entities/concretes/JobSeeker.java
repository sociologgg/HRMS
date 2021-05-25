package kodlamaio.hrms.entities.concretes;





import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name= "jobseekers")
@PrimaryKeyJoinColumn(name="userid",referencedColumnName = "id")


public class JobSeeker extends User{
	
//	@Id
//	@Column(name = "userid")
//	private int id;

	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name="IdentityNumber", unique = true)
	private String identityNumber;
	
	@Column(name="BirthDate")
	private Date birthDate;
	
	
	
	public JobSeeker() {}

	public JobSeeker( String firstName, String lastName, String identityNumber,Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
		
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


}
