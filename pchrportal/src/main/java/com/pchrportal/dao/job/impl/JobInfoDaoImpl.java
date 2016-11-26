package com.pchrportal.dao.job.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.pchrportal.entity.job.JobInfoEntity;
import com.pchrportal.util.GenericHibernateDaoSupport;

@Repository(value="jobInfoDaoImpl")
public class JobInfoDaoImpl extends GenericHibernateDaoSupport {
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private static final Logger log = LoggerFactory.getLogger(JobInfoDaoImpl.class);
	
	public boolean save(JobInfoEntity jobEntity) {
		log.debug("Entered into JobInfoEntity -->: ");
		try {
			getHibernateTemplate().save(jobEntity);
			log.debug("Persist JobInfoEntity successful");
			return true;
		} catch (RuntimeException re) {
			log.error("Persist JobInfoEntity failed", re);
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public List<JobInfoEntity> findJobsListInformation() {
		List<JobInfoEntity> jobInfoEntityList = null;
		try {
			/* Get the jobInfoEntityList information */
			jobInfoEntityList = (List<JobInfoEntity>) getHibernateTemplate().findByNamedQuery("qryAllJobsInfo");
		} catch (RuntimeException re) {
			log.error("failed in  jobInfoEntityList failed ", re);
		}
		return jobInfoEntityList;
	}

}
