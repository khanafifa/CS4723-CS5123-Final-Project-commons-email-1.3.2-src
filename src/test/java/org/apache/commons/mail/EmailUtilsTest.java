package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class EmailUtilsTest {

	 @Test
	    public void testUrlEncoding() throws UnsupportedEncodingException {
			System.out.println("fwhxxx -This is a message from the EmailUtilsTest - "
					+ "testing encodeURL , check if string is satisfies the \"US-ASCII\" charset condition");
	        assertEquals("fwhadf", EmailUtils.encodeUrl("fwhadf"));
	        assertEquals("1234567890", EmailUtils.encodeUrl("1234567890"));
	        assertEquals("Test%20CID", EmailUtils.encodeUrl("Test CID"));
	        assertEquals("a.b@def.org", EmailUtils.encodeUrl("a.b@def.org"));
	        assertEquals("a%26b%26c@ut.org", EmailUtils.encodeUrl("a&b&c@ut.org"));
	    }

}
