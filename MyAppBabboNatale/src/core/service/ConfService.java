package core.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import core.models.Conf;


public class ConfService {

	private String componentName = this.getClass().getSimpleName();
	
	public ConfService() {

	}

	public Conf readProperties() {
		Conf conf = new Conf();

		try {
			FileInputStream inStream = new FileInputStream("res/config.properties");
			Properties properties = new Properties();
			properties.load(inStream);

//			conf.setEnv(properties.getProperty("conf.env"));
//			conf.setDbHost(properties.getProperty("conf.dbhost"));
//			conf.setDbName(properties.getProperty("conf.dbname"));



		} catch (FileNotFoundException e) {
			System.err.println("#" + componentName + " - Eccezzione del conf service");

		} catch (IOException e) {
			System.err.println("#" + componentName + " - Eccezzione del conf service");
		}

		return conf;
	}

}
