package com.qa.utilities;

import org.apache.log4j.Logger;

public class GetLogs {
	private Logger log=null;
	public GetLogs(Logger log) 
	{
		this.log=log;
	}

	public Logger doGetLogs()
	{
		log = Logger.getLogger("Debug Logs");
		return log;
	}
}
