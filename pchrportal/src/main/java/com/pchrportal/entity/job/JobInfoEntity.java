package com.pchrportal.entity.job;



import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.pchrportal.util.QueryUtils;


@Entity
@Table(name="JOB_MST_TBL")
@NamedQueries({
	@NamedQuery(name = "qryAllJobsInfo", query = QueryUtils.qryAllJobsInfo)
	
})
public class JobInfoEntity {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private long id;
	private String jobTitle;
	private String jobDescription;
	private String companyName;
	private String logo;
	private String location;
	private String postedDate;
	

	@ElementCollection
	@CollectionTable(name="SKILLS_MST_TBL",  joinColumns=@JoinColumn(name="ID"))		
	private List<String> skills;
	

	
	public List<String> getSkills() {
		return skills;
	}


	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


	public JobInfoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Column(name = "JOB_TITLE")
	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	@Column(name = "JOB_DESCRIPTION")
	public String getJobDescription() {
		return jobDescription;
	}


	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Column(name = "COMPANY_NAME")
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "LOGO")
	public String getLogo() {
		return logo;
	}


	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "LOCATION")
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "LOCATION")
	public String getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}

}

