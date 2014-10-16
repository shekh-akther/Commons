/**
 * 
 */
package com.dreamers.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate Domain Name or Ip Address.
 * 
 * @author Shekh
 *
 */
public class DomainNameValidator {

	private static final String DOMAIN_NAME_PATTERN = "^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$";

	private static final String IP_ADDRESS_PATTERN = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
	
	private static final String HOST_NAME_PATTERN = DOMAIN_NAME_PATTERN + "|" + IP_ADDRESS_PATTERN;
	
	private static Pattern pattern;
	
	private static Matcher matcher;
			
	static{
		pattern = Pattern.compile(HOST_NAME_PATTERN); 
	}

		
	public static boolean isValidHostName( String hostName) {
		matcher = pattern.matcher(hostName);
		return matcher.matches();
	}
	
	

}
