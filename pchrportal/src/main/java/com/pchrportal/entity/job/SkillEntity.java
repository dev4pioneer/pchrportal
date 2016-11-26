/*package com.pchrportal.entity.job;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SKILLS_MST_TBL")
public class SkillEntity {
	private long id;
	private List<String> SkillName;
	private JobEntity jobEntity;
	
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<String> getSkillName() {
		return SkillName;
	}

	public void setSkillName(List<String> skillName) {
		SkillName = skillName;
	}

	public JobEntity getJobEntity() {
		return jobEntity;
	}

	public void setJobEntity(JobEntity jobEntity) {
		this.jobEntity = jobEntity;
	}
	
	

}
*/