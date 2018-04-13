package com.qtpselenium.hybrid.base;

import java.io.File;
import java.util.Date;

public class Temp {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString().replace(":", "_").replace(" ", "_")+".html");
		/*
		String testName="TestB";
		Xls_Reader xls = new Xls_Reader("D:\\Common\\Temp\\Hybrid Jan18\\SuiteA.xlsx");
		// find the row Number of the testcase
		int testStartRowNum=1;
		while(!xls.getCellData("Data", 0, testStartRowNum).equals(testName)){
			testStartRowNum++;
		}
		System.out.println("Row Number of test is "+testStartRowNum );
		// find total cols in testcase
		int colStartRowNum = testStartRowNum+1;
		int totalCols=0;
		while(!xls.getCellData("Data", totalCols, colStartRowNum).equals("")){
			totalCols++;
		}
		System.out.println("Total Cols - "+totalCols );
		// find total rows in testcase
		int dataStartRowNumber=testStartRowNum+2;
		int totalRows=0;
		while(!xls.getCellData("Data", 0, dataStartRowNumber).equals("")){
			totalRows++;
			dataStartRowNumber++;
		}
		System.out.println("Total Rows "+ totalRows);
		
		// read the data
		dataStartRowNumber=testStartRowNum+2;
		Hashtable<String,String> table=null;
		int finalRows = dataStartRowNumber+totalRows;
		Object[][] myData = new Object[totalRows][1];
		int i=0;
		for(int rNum=dataStartRowNumber;rNum<finalRows;rNum++){
			table = new Hashtable<String,String>();
			for(int cNum=0;cNum<totalCols;cNum++){// put data in hashtable
				String data = xls.getCellData("Data", cNum, rNum);
				String key = xls.getCellData("Data", cNum, colStartRowNum);
				//System.out.println(key+" --- "+data);
				table.put(key, data);
			}
			System.out.println(table);
			myData[i][0]=table;
			i++;
			System.out.println("----------------");
		}
		
	*/
		
		new File("D:\\xyz\\abc\\pqr").mkdirs();
		
	}

}
