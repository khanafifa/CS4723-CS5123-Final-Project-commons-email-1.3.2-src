package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.junit.Test;

import junit.framework.TestCase;

public class TemplateTest extends TestCase{
	private static final String[] SAMPLE_EMAILS = { "firstname@lastname.com", 
			"first@last.com",
			"sample.name@utsa.edu" };

	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddBcc1() throws EmailException {
		System.out.println("This is a message from the template test.");
		testEmail.addBcc("a@b.com");
		assertEquals("a@b.com", testEmail.getBccAddresses().get(0).toString());
	}
	/* 1.Testing addBcc(String... emails) */
	@Test
	public void testAddBcc() throws EmailException {
		testEmail.addBcc(SAMPLE_EMAILS);
		for (int i = 0; i < SAMPLE_EMAILS.length; i++) {
			assertEquals("Bcc email address ", SAMPLE_EMAILS[i], testEmail.getBccAddresses().get(i).toString());
		}
	}

	/* testing addBcc method for empty array of emails */
	@Test
	public void testAddBccArrayLength() throws EmailException {
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
		final String[] SAMPLE_EMAILS = null;
		try {
			testEmail.addBcc(SAMPLE_EMAILS);
			fail("Failed to throw Email exception");
		} catch (EmailException e) {
			assertEquals("Exception Message","Address List provided was invalid", e.getMessage());
		}

	}
	
	/* 2. Testing addCc(String email) */
	@Test
	public void testAddCcNull() throws EmailException {
		final String[] SAMPLE_EMAILS = null;
		try {
			testEmail.addCc(SAMPLE_EMAILS);
			fail("Failed to throw Email exception");
		} catch (EmailException e) {
			assertEquals("Exception Message","Address List provided was invalid", e.getMessage());
		}

	}
	@Test
	public void testAddCcLength() throws EmailException {
		testEmail.addCc(SAMPLE_EMAILS);
			assertEquals("AddCc No of emails addresses ", SAMPLE_EMAILS.length, testEmail.getCcAddresses().size());
	}
	
	@Test
	public void testAddCc() throws EmailException {
		  testEmail.addCc("a@b.com");
		  assertEquals("AddCc email address", "a@b.com",testEmail.getCcAddresses().get(0).toString()); 
	}

	

}
