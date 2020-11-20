package com.lti.mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWelcome {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test 
	 public void testShow() {
		WelcomeClass w= new WelcomeClass(); 
		assertEquals("Hello World - DevOps !!",w.show());
		}
	

}
