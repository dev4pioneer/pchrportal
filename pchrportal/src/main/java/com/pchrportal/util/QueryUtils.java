package com.pchrportal.util;

public class QueryUtils {
	
	/*Course queries */
	public static final String qryAllJobsInfo = "select jobInfoEntity  from JobInfoEntity jobInfoEntity " +
			"left outer join fetch jobInfoEntity.skills as skills";
	}
