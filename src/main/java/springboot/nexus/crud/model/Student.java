package springboot.nexus.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stdID;
	
	@Column(name = "Name", nullable = false)
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Admission_Year")
	private String admissionYear;
	
	@Column(name = "Phone", nullable = false)
	private String phone;
	
	@Column(name = "Email", nullable = false)
	private String email;

	public Student() {
		super();
		
	}

	public Student(int stdID, String name, String address, String admissionYear, String phone, String email) {
		super();
		this.stdID = stdID;
		this.name = name;
		this.address = address;
		this.admissionYear = admissionYear;
		this.phone = phone;
		this.email = email;
	}

	public long getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdmissionYear() {
		return admissionYear;
	}

	public void setAdmissionYear(String admissionYear) {
		this.admissionYear = admissionYear;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", name=" + name + ", address=" + address + ", admissionYear="
				+ admissionYear + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
}
