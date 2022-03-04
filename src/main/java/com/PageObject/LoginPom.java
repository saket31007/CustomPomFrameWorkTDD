package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// encapsulation achieved 

public class LoginPom {
	
	//WebDriver driver;
	
	@FindBy(how=How.XPATH, using= "//input[@id ='email']")
	private WebElement	Emailid;
	
	@FindBy(how = How.XPATH, using = "//input[@id ='pass']")
	private WebElement	Pass;

	@FindBy(how = How.XPATH, using ="//button[@type ='submit']")
	private WebElement Loginbtn;

   
   

	public WebElement getEmailid() {   //getter
		return Emailid;
	}
	
	public WebElement getPass() {   //getter for password
		return Pass;
	}

	public WebElement getBtn() {
		return Loginbtn;
	}

}
