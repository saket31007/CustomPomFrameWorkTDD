package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass {
	
	@Test
	
	public void VerifyTest() {
		
	LoginPom login =PageFactory.initElements(driver,LoginPom.class );
	
//	login.getEmailid().sendKeys(excel.getStringData("LoginSheet", 0, 0));
//	login.getPass().sendKeys(Config.getStage_UserName());
//	login.getBtn().click();

Library.CustomSendKeys(login.getEmailid(), excel.getStringData("LoginSheet", 0, 0));
	
Library.CustomSendKeys(login.getPass(), Config.getStage_UserName());	

Library.CustomMovetoElement(driver, login.getBtn()); // I made just for reference // these custom mathods are comming from library class

//Library.CustomClick(login.getBtn());

 Library.CustomContexClick(login.getBtn());
		
	}

}
