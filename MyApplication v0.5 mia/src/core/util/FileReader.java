package core.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import model.Conf;

public class FileReader {

	private static String componentName = FileReader.class.getSimpleName();

	public FileReader() {

	}

	public static Conf readProperties() {
		Conf conf = new Conf();

		try {
			FileInputStream inStream = new FileInputStream("res/config.properties");
			Properties properties = new Properties();
			properties.load(inStream);

			// conf properties
			conf.setEnv(properties.getProperty("conf.env"));
			conf.setDbHost(properties.getProperty("conf.dbhost"));
			conf.setDbName(properties.getProperty("conf.dbname"));

			// app properties
			conf.setPremiumDayBonus(Integer.parseInt(properties.getProperty("app.premiumDayBonus")));

		} catch (FileNotFoundException e) {
			System.err.println("#" + componentName + " - Eccezzione del file reader");

		} catch (IOException e) {
			System.err.println("#" + componentName + " - Eccezzione del property loader");
		}

		return conf;
	}
	

}
