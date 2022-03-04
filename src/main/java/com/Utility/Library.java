package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;


// here we create custom common methods with validations

public class Library {

	public static ExtentTest test;      // isske refrence ko hum listners class me call krnge aur handover krnge ExtentTest ke 	refrence ko / jo bhi bhi acchechmnt 
	
	                                                       //report me dena hai on start case bo hmne test ko de diya hai  
	WebDriver driver;
	public static Actions act;
	
	public static void CustomSendKeys(WebElement element, String value ) {
		
		element.sendKeys(value);
	}
	
	public static void CustomClick(WebElement element) {
		
		element.click();
		
	}
	
	public static void CustomMovetoElement(WebDriver driver, WebElement value ) {
		
	    act = new Actions(driver);
		act.moveToElement(value);
	
	}
	
	public static void CustomContexClick(WebElement element) {
		
		act.contextClick().build().perform();
		act.contextClick(element).build().perform();
		
		
	}
	
	// need to create more custom common methods like this
	
	// ScreenShot
	//doubleclick
   //Context click
	//drop down with select class
	//Aleart
	//copy paste
	//Assert 
	//childwindowhandling
	//Action move to elemnt 
}


