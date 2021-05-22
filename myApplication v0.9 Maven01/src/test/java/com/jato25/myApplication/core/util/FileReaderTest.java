package com.jato25.myApplication.core.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import org.junit.Test;

import core.util.FileReader;
import model.Conf;

public class FileReaderTest {

	Conf conf;
	FileReader fileReader = new FileReader();

	@Test
	public void readPropertiesOK() {

		try {
			String path = "config.properties";
			conf = fileReader.readProperties(path);

			assertNotNull(conf);
			assertEquals("errore nella valorizzazione di env", "SVIL", conf.getEnv());
			assertEquals("errore nella valorizzazione di bdhost", "127.0.0.1", conf.getDbHost());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	//@Test
	public void readPropertiesCheckEx() {

		try {

			conf = fileReader.readProperties("wrongPath");

			fail("L'eccezione non è stata sollevata");

		} catch (FileNotFoundException e) {

			assertTrue("il tipo di eccezione non è corretta", e instanceof FileNotFoundException);

//			e.printStackTrace();
		}

	}

}
