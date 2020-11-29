package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.junit.Test;

import junit.framework.TestCase;

public class EmailTest extends TestCase{
	private static final String[] SAMPLE_EMAILS = { "firstname@lastname.com", 
			"first@last.com",
			"sample.name@utsa.edu" };

	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	/* 1.Testing addBcc(String... emails) */
	@Test
	public void testAddBcc() throws EmailException {
		System.out.println("This is a message from the Emai test- testing addBcc Method");
		testEmail.addBcc(SAMPLE_EMAILS);
		for (int i = 0; i < SAMPLE_EMAILS.length; i++) {
			assertEquals("Bcc email address ", SAMPLE_EMAILS[i], testEmail.getBccAddresses().get(i).toString());
		}
	}

	/* testing addBcc method for empty array of emails */
	@Test
	public void testAddBccArrayLength() throws EmailException {
		System.out.println("This is a message from the Email test- testing addBcc Method for empty Emails");
		final String[] SAMPLE_EMAILS = {};
		try {
			testEmail.addBcc(SAMPLE_EMAILS);
			fail("Failed to throw Email exception");
		} catch (EmailException e) {
			assertEquals("Exception Message","Address List provided was invalid", e.getMessage());
		}

	}

	/* testing addBcc method null */
	@Test
	public void testAddBccNull() throws EmailException {
		System.out.println("This is a message from the Email test- testing addBcc Method for null emails");
		final String[] SAMPLE_EMAILS = null;
		try {
			testEmail.addBcc(SAMPLE_EMAILS);
			fail("Failed to throw Email exception");
		} catch (EmailException e) {
			assertEquals("Exception Message","Address List provided was invalid", e.getMessage());
		}

	}
	
	@Test
	public void testAddHeaderEmptyName() throws IllegalArgumentException {
		System.out.println("This is a message from the Email test- testing AddHeader Method for empty Name");
		try {
			testEmail.addHeader("", "mailvalue");
			fail("Failed to throw Illegal Argument exception");
		} catch (IllegalArgumentException e) {
			assertEquals("name can not be null or empty", e.getMessage());
		}
		testEmail.addHeader("mailer", "mailvalue");
	}
	
	@Test
	public void testAddHeaderEmptyValue() throws Exception {
		System.out.println("This is a message from the Email test- testing AddHeader Method for empty Value");
		try {
			testEmail.addHeader("mailer", "");
			fail("Failed to throw Illegal Argument exception");
		} catch (IllegalArgumentException e) {
			assertEquals("value can not be null or empty", e.getMessage());

		}
		testEmail.addHeader("mailer", "mailvalue");
	}
	

	

}
