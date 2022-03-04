package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String path = "C:\\Users\\saket\\eclipse-workspace\\CustomFrameWork\\Config\\Config.Properties";
		
		File src = new File(path);
		
		FileInputStream fis = new FileInputStream(src);
		
		pro =new Properties();
		
		pro.load(fis);
	}
        
	public String getStage_Url() {
		
		return pro.getProperty("StageUrl");
	}
	
	public String getLive_Url() {
		return pro.getProperty("LiveUrl");
		
		
	}
	
	public String getStage_UserName() {
		return pro.getProperty("UsernameStage");
	
	
	}
	
	
	
}
