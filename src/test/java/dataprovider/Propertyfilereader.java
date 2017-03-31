package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfilereader {
	static Properties pro;
	public Propertyfilereader() throws Exception{
		File file= new File("D:\\seleniumworkspace\\com.divinitiautomation\\Configuration\\config.properties");
		FileInputStream fin= new FileInputStream(file);
		pro= new Properties();
		pro.load(fin);
		System.out.println("property file loaded successfully ");
	}
	public String getapplicationurl(){
		String URL=pro.getProperty("url");
		System.out.println("we are entering following url --"+URL);
		return URL;
	}
}