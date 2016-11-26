package com.pchrportal.service.job;

import java.util.List;

import com.pchrportal.entity.job.JobInfoEntity;

public interface IJobService {

	boolean saveJobInfo(JobInfoEntity jobInfoEntity);

	List<JobInfoEntity> getJobsListInformation();

}
