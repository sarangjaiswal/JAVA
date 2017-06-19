package com.sarangjaiswal.POM.utils;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		//Logic to create a filename based on the time stamp
		if(extent ==null){
			Date d = new Date();
			String filename = d.toString().replace(":", "_").replace(" ", "_");
			
			//Providing the path to the report folder and loading the config.xml file 
			extent = new ExtentReports(Constants.REPORT_FOLDER+filename, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(Constants.REPORTCONFIGPATH));
		}
		return extent;
	}
	
}
