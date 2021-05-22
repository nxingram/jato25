package com.jato25.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jato25.ABSTest;
import com.jato25.myApplication.model.USR;

public class ABSDaoTest extends ABSTest{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindAll() {
		
	}

	@Test
	public void testFind() {
		
	}

	@Test
	public void testFindByUser() {
		
	}

	@Test
	public void testSave() {
		usrDao.save(new USR(), "testcomponent");
	}

	@Test
	public void testDelete() {
//		fail("Not yet implemented");
	}
}
