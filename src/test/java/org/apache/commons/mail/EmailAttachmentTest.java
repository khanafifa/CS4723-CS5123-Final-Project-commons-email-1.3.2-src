package org.apache.commons.mail;
import org.apache.commons.mail.EmailAttachment;
import static org.junit.Assert.*;
import java.net.URL;
import org.junit.Before;
import org.junit.Test;
import javax.mail.MessagingException;


public class EmailAttachmentTest { 
	EmailAttachment testAttachment;
	
	@Before
	public void setUp() throws MessagingException {
		testAttachment = new EmailAttachment();
	}
	@Test
	public void testgetname() throws Exception {
		System.out.println("fwhxxx- This is a message from the EmailAttachmentTest- testing getName()  for proper attachement name");
		testAttachment.setName("attachment.jpg");	
		assertEquals("attachment.jpg", testAttachment.getName());
	}
	@Test
	public void testgetDescription() throws Exception {
		System.out.println("fwhxxx- This is a message from the EmailAttachmentTest- testing getDescription()");
		testAttachment.setDescription("This is a test attachment");
		assertEquals("This is a test attachment", testAttachment.getDescription());
	}
	@Test
	public void testgetURL() throws Exception {	
		System.out.println("fwhxxx- This is a message from the EmailAttachmentTest- testing getURL()");
		URL myURL = new URL("http://example.com/");
		testAttachment.setURL(myURL);	
		assertEquals(myURL, testAttachment.getURL());
	}

	
	
	
}