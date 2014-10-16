/**
 * 
 */
package com.dreamers.regx;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Shekh
 *
 */
public class TestDomainNameValidator {

	private String validDomainName = "www.google.com";
	
	private String inValidDomainName = "www.google.c.o.m";
	
	private String validIpAddress = "192.168.0.7";
	
	private String invalidIpAddress = "777.777.777.777";
	

	/**
	 * Test method for {@link com.dreamers.regx.DomainNameValidator#isValidHostName(java.lang.String)}.
	 */
	@Test
	public void testIsValidHostName_ValidDomainName() {
		 assertTrue(DomainNameValidator.isValidHostName(validDomainName ));
	}
	
	@Test
	public void testIsValidHostName_InvalidDomainName() {
		assertFalse(DomainNameValidator.isValidHostName(inValidDomainName));
	}
	
	@Test
	public void testIsValidHostName_ValidIpAddress() {
		assertTrue(DomainNameValidator.isValidHostName(validIpAddress));
	}
	
	@Test
	public void testIsValidHostName_InvalidIpAddress() {
		assertFalse(DomainNameValidator.isValidHostName(invalidIpAddress));
	}

}
