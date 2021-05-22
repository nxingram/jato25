package com.jato25.myApplication.core.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.jato25.myApplication.model.Conf;

public class FileReaderTest {
	
	
	Conf conf;
	FileReader  fileReader =  new FileReader();
	
	
	

	@Test
	public void readPropertiesOK() {

		
		

		try {
			conf = fileReader.readProperties("res/config.properties");

			assertNotNull(conf);
			assertEquals("errore nella valorizzazione di env", "SVIL", conf.getEnv());
			assertEquals("errore nella valorizzazione di bdhost", "127.0.0.1", conf.getDbHost());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	@Test
	public void readPropertiesCheckEx()
	{
		
		
		try {
			
			conf =  fileReader.readProperties("wrongPath");
			
			fail("L'eccezione non è stata sollevata");
			
			
		} catch (FileNotFoundException e) {
		
			assertTrue("il tipo di eccezione non è corretta", e instanceof FileNotFoundException);
			
			e.printStackTrace();
		}
		
		
	}

}
