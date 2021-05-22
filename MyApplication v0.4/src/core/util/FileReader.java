package core.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import model.Conf;

public class FileReader {

	private String componentName = this.getClass().getSimpleName();

	public FileReader() {

	}

	public Conf readProperties() {
		Conf conf = new Conf();
		
		try {
			FileInputStream inStream = new FileInputStream("res/config.properties");
			Properties properties = new Properties();
			properties.load(inStream);

			conf.setEnv(properties.getProperty("conf.env"));
			conf.setDbHost(properties.getProperty("conf.dbhost") );
			conf.setDbName(properties.getProperty("conf.dbname"));
			
//			System.out.println("#" + componentName + " - " 
//					+ "conf.env: " + conf.getEnv()
//					+ ", conf.dbhost: " + conf.getDbHost()
//					+ ", conf.dbname: " + conf.getDbName()
//			);
			

		} catch (FileNotFoundException e) {
			System.err.println("#" + componentName + " - Eccezzione del file reader");

		} catch (IOException e) {
			System.err.println("#" + componentName + " - Eccezzione del property loader");
		}
		
		return conf;
	}

}
