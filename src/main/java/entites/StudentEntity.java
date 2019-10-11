package entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "STUDENT")
public class StudentEntity implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	private String id;

	@Version
	@Column(name = "VERSION")
	private Integer version;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ADDRESS")
	private String address;

	@Temporal(TemporalType.DATE)
	@Column(name = "DOB")
	private Date dob;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_NO")
	private String mobileNo;

	@Column(name = "PARENTS_EMAIL")
//	@Email
	private String parentsEmail;

	@Column(name = "PARENTS_MOBILE_NO")
	private String parentsMobileNo;

	@Column(name = "SEMESTER")
//	@Size(min = 1, max = 1)
	private Integer semester;

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_ON")
	private Date modifiedOn;

	@Column(name = "MODIFIED_BY")
//	@NotNull
	private String modifiedBy;

	@Column(name = "IS_ACTIVE")
	private Boolean isActive;

	// RELATIONSHIPS
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "FK_COURSE_CODE")
//	private CourseEntity course;
//
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "FK_SECTION_ID")
//	private SectionEntity section;

	public StudentEntity() {
	}

	public StudentEntity(String id) {
		this.id = id;
	}

	public StudentEntity(String id, String name, String address, Date dob, String email, String mobileNo,
			String parentsEmail, String parentsMobileNo, Integer semester, Date modifiedOn, String modifiedBy,
			Boolean isActive) {
		this.id = id;

		this.name = name;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.mobileNo = mobileNo;
		this.parentsEmail = parentsEmail;
		this.parentsMobileNo = parentsMobileNo;
		this.semester = semester;
		this.modifiedOn = modifiedOn;
		this.modifiedBy = modifiedBy;
		this.isActive = isActive;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getParentsEmail() {
		return this.parentsEmail;
	}

	public void setParentsEmail(String parentsEmail) {
		this.parentsEmail = parentsEmail;
	}

	public String getParentsMobileNo() {
		return this.parentsMobileNo;
	}

	public void setParentsMobileNo(String parentsMobileNo) {
		this.parentsMobileNo = parentsMobileNo;
	}

	public Integer getSemester() {
		return this.semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", version=" + version + ", name=" + name + ", address=" + address + ", dob="
				+ dob + ", email=" + email + ", mobileNo=" + mobileNo + ", parentsEmail=" + parentsEmail
				+ ", parentsMobileNo=" + parentsMobileNo + ", semester=" + semester + ", modifiedOn=" + modifiedOn
				+ "]";
	}



}
