package app.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties getProperties(String path) {
		Properties properties = new Properties();
		try {
			InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
			properties.load(inStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
}
