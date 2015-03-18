package mum.universitystore.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class PaymentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer", referencedColumnName = "id")
	private Member member;

	@NotNull(message="{PaymentInfo.fName.validation}")
	private String firstName;
	@NotNull(message="{PaymentInfo.lName.validation}")
	private String lastName;
	@NotNull(message="{PaymentInfo.add1.validation}")
	private String address1;
	private String address2;
	@NotNull(message="{PaymentInfo.state.validation}")
	private String state;
	@NotNull(message="{PaymentInfo.zip.validation}")
	private String zip;
	@NotNull(message="{PaymentInfo.country.validation}")
	private String country;
	@NotNull(message="{PaymentInfo.mail.validation}")
	private String email;
	@Temporal(TemporalType.DATE)
	private java.util.Date expirationDate;
	private String CVV;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(java.util.Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		CVV = cVV;
	}

}
