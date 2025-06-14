package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader  {
	
	private static Properties prop;
	
	public static Properties initProperties()
	{
		 prop = new Properties();
		 
		try {
		FileInputStream file = new FileInputStream("src/test/resources/ConfigProperties/config.properties");
		prop.load(file);
		}
		catch (IOException e) {
	        e.printStackTrace();
	    }
		
		return prop;
	}
	
	public static String getProperty(String key)
	{
		if(prop == null)
		{
			initProperties();
		}
		return prop.getProperty(key);
	}
}
