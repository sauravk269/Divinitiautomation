package factory;


import dataprovider.Exceldataread;
import dataprovider.Propertyfilereader;

public class DataProviderFactory {
	public static Propertyfilereader configdata() throws Exception{
		Propertyfilereader config= new Propertyfilereader();
		return config;
	}
	public static Exceldataread getexcel() throws Exception{
		Exceldataread excel= new Exceldataread();
		return excel;
	}
}

