package com.pchrportal.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pchrportal.entity.job.JobInfoEntity;
import com.pchrportal.service.job.IJobService;

@Controller
@RequestMapping("/job")
public class JobController {
	private static final Logger log = LoggerFactory.getLogger(JobController.class);
	
	@Autowired
	@Qualifier(value="jobServiceImpl")
	IJobService jobService;
	
	/**
	 * Method used to save posted job's information.
	 * 
	 * @param jobInfoEntity
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/postJob", method = RequestMethod.POST)
	public @ResponseBody boolean saveJobInfo(@RequestBody JobInfoEntity jobInfoEntity, HttpSession session) {
		if(jobInfoEntity != null){
			return  jobService.saveJobInfo(jobInfoEntity);
		}
		else {
			return false;
		}
	}
	
	/**
	 * Method used to get list of job's information.
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/getJobs", method = RequestMethod.GET)
	public @ResponseBody  List<JobInfoEntity> getJobsInformation(HttpSession session) {
		List<JobInfoEntity> jobsList = jobService.getJobsListInformation();
		return jobsList;
	}

}
