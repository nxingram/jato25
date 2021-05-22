package test;

import static org.junit.Assert.*;

import org.junit.Test;

import core.util.FileReader;
import model.Conf;

public class FileReaderTest {

	@Test
	public void testReadProperties() {
//		fail("Not yet implemented");
		
		FileReader fileReader = new FileReader();
		Conf conf = fileReader.readProperties();
		
		assertNotNull(conf);
		
		assertEquals("errore nella valorizzazione di env", "SVIL", conf.getEnv());
		assertEquals("errore nella valorizzazione di dbhost", "127.0.0.1", conf.getDbHost());
		
	}

	
}
