package com.muthu.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestJunit {
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	TestMain testClass = null;
	@Before
	public void setUp() throws Exception {
		testClass = new TestMain();
		
	}

	@After
	public void tearDown() throws Exception {
		testClass = null;
	}

	@Test
	public void testFormatDateFailure() throws ParseException {
		//fail("Not yet implemented");
		String format = "yyyy-MM-dd";
		expectedEx.expect(ParseException.class);
		testClass.formatToDate(format);
		
		
		
	}
	
	@Test
	public void testFormatDateSuccess() throws ParseException {
		//fail("Not yet implemented");
		String format = "2015-12-12";
		assertNotNull(testClass.formatToDate(format));
		
		
	}

	@Test
	public void testFormatDateStr() {
		//fail("Not yet implemented");
		Calendar cal = Calendar.getInstance();
		
		assertNotNull(testClass.formatDatetoStr(cal.getTime()));
		
		
		
	}

}
