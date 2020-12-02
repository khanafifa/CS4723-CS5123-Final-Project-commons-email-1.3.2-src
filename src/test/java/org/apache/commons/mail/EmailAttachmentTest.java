package org.apache.commons.mail;
import org.apache.commons.mail.EmailAttachment;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import javax.mail.MessagingException;

import org.junit.Test;



public class EmailAttachmentTest {
	
EmailAttachment testAttachment;
	
	public void setUp() throws MessagingException {
		testAttachment = new EmailAttachment();
	}
	
	/*Test getName() method */
	@Test
	public void testgetname() throws Exception {
		System.out.println("fwhxxx- This is a message from the EmailAttachmentTest"
				+ "Test method for getName()");
		testAttachment.setName("anc.jpg");	
		assertEquals("abc.jpg", testAttachment.getName());
	}
	
	/*Test getURL() method */
	@Test
	public void testGetURL() throws Exception {	
		System.out.println("fwhxxx- This is a message from the EmailAttachmentTest"
				+ "Test method for getURL()");
		URL myURL = new URL("http://xyz.com/");
		testAttachment.setURL(myURL);	
		assertEquals(myURL, testAttachment.getURL());
	}
 }
