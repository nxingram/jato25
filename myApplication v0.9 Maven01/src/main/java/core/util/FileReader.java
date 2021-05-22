package core.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import model.Conf;

public class FileReader {

	private String componentName = this.getClass().getSimpleName();
	private boolean isDebugEnabled;

	public Conf readProperties(String path) throws FileNotFoundException {

		try {
//			path = "config.properties";
//			FileInputStream input = new FileInputStream(path);
			InputStream input = FileReader.class.getClassLoader().getResourceAsStream(path);

			Properties properties = new Properties();

			try {
				properties.load(input);
			} catch (IOException e) {
				System.err.println("#" + componentName + " - Eccezione nel caricamento delle properties");
				
				
			}
			
			if (isDebugEnabled)
			System.out.println("#" + componentName 
									+ " - conf.env:" 
									+  properties.getProperty("conf.env")
									+ " conf.dbhost:" 
									+ properties.getProperty("conf.dbhost")
									+ " conf.dbname:" 
									+ properties.getProperty("conf.dbname")
									+ " app.name:" + properties.getProperty("app.name")
									+ " app.version:" + properties.getProperty("app.version"));

			
			return   new Conf(properties.getProperty("conf.env"),
								  properties.getProperty("conf.dbhost"),
								  properties.getProperty("conf.dbname"),
								  Integer.valueOf(properties.getProperty("app.premiumBonusDay")));
			
			
			

		}

//		catch (FileNotFoundException e) {
			catch (Exception e) {

			System.err.println("#" + componentName + " - Eccezione del file reader");
			throw e;

		}
		
		

	}

}
