import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CryptoManagerTestPublic {
	CryptoManager cryptoManager;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("JAVA"));
		assertTrue(CryptoManager.isStringInBounds("\"JAVA IS FUN\""));
		assertFalse(CryptoManager.isStringInBounds("java"));
		assertFalse(CryptoManager.isStringInBounds("{JAVA"));
		assertFalse(CryptoManager.isStringInBounds("\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\""));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
		assertEquals("DEF", CryptoManager.caesarEncryption("ABC", 3));
		assertEquals("!\"#", CryptoManager.caesarEncryption("ABC", 96));
		assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
		assertEquals("UFTUJOH", CryptoManager.caesarEncryption("TESTING", 1));
		assertEquals("WKLV#LV#DQRWKHU#WHVW", CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 3));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("TESTING", CryptoManager.caesarDecryption("UFTUJOH", 1));
		assertEquals("\t \b \t", CryptoManager.caesarDecryption(";,:;05.G(56;/,9G:;905.", 999));
		assertEquals("\b\f\f \f", CryptoManager.caesarDecryption("4188;LC;>80", 300));
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("7.C<.@F", CryptoManager.bellasoEncryption("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("5*>>HH(4>8;99-B", CryptoManager.bellasoEncryption("MERRY CHRISTMAS", "HELLO"));
		assertEquals("75<62Y&C.A2&XX5MG(%$", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("4%34).'", CryptoManager.bellasoDecryption("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("-%229@#(2)34-!3", CryptoManager.bellasoDecryption("UJ^^((HT^X[YYM\"", "HELLO"));
		assertEquals("4()3@)3@!./4(%2@4%34", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));

	}

}
