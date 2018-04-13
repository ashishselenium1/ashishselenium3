package com.qtpselenium.rediff.hybrid.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

public class AppKeywords extends GenericKeywords{

	public void login(){
		test.log(Status.INFO, "Logging in"); 
		getObject("money_xpath").click();
		getObject("signin_xpath").click();
		String username="";
		String password="";
		
		if(data.get("Username") == null){
			username=envProp.getProperty("defaultUsername");
			password=envProp.getProperty("defaultPass");
		}else{
			username=data.get("Username");
			password=data.get("Password");
		}
		getObject("username_id").sendKeys(username);
		getObject("emailsubmit_id").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(getObject("password_id")));
		
		getObject("password_id").sendKeys(password);
		getObject("continue_id").click();
		try{
		Thread.sleep(5000);
		acceptAlert();
		}catch(Exception e){}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password_id")));
	}
	
	public void validateLogin(){
		test.log(Status.INFO, "Validating Login");
		boolean result = isElementPresent("portfolioSelection_xpath");
		String expectedResult=data.get("ExpectedResult");
		String actualResult="";
		
		if(result)	
			actualResult="Loginsuccess";
		else
			actualResult="Loginfailure";
		if(!actualResult.equals(expectedResult))
			reportFailure("Got  result "+actualResult );
	}
	
	public void defaultLogin(){
		String username=envProp.getProperty("adminusername");
		String password=envProp.getProperty("adminpassword");
		System.out.println("Default username "+username );
		System.out.println("Default password "+password );
	}
	
	
	
	public void verifyPortFolio(){
		waitForPageToLoad();
	    WebElement e=getObject("portfolioSelection_xpath");
	    Select s = new Select(e);
	    System.out.println("---Final----");
	    System.out.println(s.getFirstSelectedOption().getText());
	}
	public void waitForPageToLoad(){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		
		while(i!=10){
		String state = (String)js.executeScript("return document.readyState;");
		System.out.println(state);

		if(state.equals("complete"))
			break;
		else
			wait(2);

		i++;
		}
		// check for jquery status
		i=0;
		while(i!=10){
	
			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);
			if(d.longValue() == 0 )
			 	break;
			else
				 wait(2);
			 i++;
				
			}
		
		}
	
	public void wait(int time){
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
