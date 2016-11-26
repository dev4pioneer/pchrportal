package com.pchrportal.service.job.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pchrportal.dao.job.impl.JobInfoDaoImpl;
import com.pchrportal.entity.job.JobInfoEntity;
import com.pchrportal.service.job.IJobService;

@Service("jobServiceImpl")
public class JobServiceImpl implements IJobService{
	
	@Resource
	JobInfoDaoImpl jobInfoDao;

	@Override
	public boolean saveJobInfo(JobInfoEntity jobEntity) {
		return jobInfoDao.save(jobEntity);
		
	}

	@Override
	public List<JobInfoEntity> getJobsListInformation() {
		return jobInfoDao.findJobsListInformation();
	}
	

}
