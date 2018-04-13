package com.qtpselenium.hybrid.suitea;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qtpselenium.hybrid.base.BaseTest;
import com.qtpselenium.hybrid.reports.ExtentManager;
import com.qtpselenium.hybrid.util.Constants;
import com.qtpselenium.hybrid.util.DataUtil;

public class TestB extends BaseTest{

	@Test(dataProvider="getData")
	public void testB(Hashtable<String,String> data){
		
		test.log(Status.INFO, "Starting TestB");
		test.log(Status.INFO, data.toString());
		
		
		
		if(DataUtil.isSkip(testName, xls) ||data.get(Constants.RUNMODE_COL).equals(Constants.RUNMODE_NO)){
			test.log(Status.SKIP, "Runmode is set to NO");
			throw new SkipException("Runmode is set to NO");
		}
		
		
		test.log(Status.INFO, "executing keywords");

	    //ds.executeKeywords(testName, xls, data);
		test.log(Status.PASS, "Test Passed");
		
	    
	}
}
