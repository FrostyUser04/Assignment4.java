import static org.junit.Assert.*;
import org.junit.Test;

public class CryptoManagerTestStudent {

    @Test
    public void testCaesarEncryption() {
        assertEquals("Caesar encryption of 'OPPENHEIMER' with key 6", "UVVKTNKOSKX", CryptoManager.caesarEncryption("OPPENHEIMER", 6));
        assertEquals("Caesar encryption of 'EINSTEIN' with key 12", "QUZ_ QUZ", CryptoManager.caesarEncryption("EINSTEIN", 12));
        assertEquals("Caesar encryption of 'STRAUSS' with key 4", "WXVEYWW", CryptoManager.caesarEncryption("STRAUSS", 4));
        assertEquals("Caesar encryption of 'NOLAN' with key 7", "UVSHU", CryptoManager.caesarEncryption("NOLAN", 7));
    }

    @Test
    public void testCaesarDecryption() {
        assertEquals("Caesar decryption of 'OPPENHEIMER' with key 6", "IJJ?HB?CG?L", CryptoManager.caesarDecryption("OPPENHEIMER", 6));
        assertEquals("Caesar decryption of 'EINSTEIN' with key 12", "9=BGH9=B", CryptoManager.caesarDecryption("EINSTEIN", 12));
        assertEquals("Caesar decryption of 'STRAUSS' with key 4", "OPN=QOO", CryptoManager.caesarDecryption("STRAUSS", 4));
        assertEquals("Caesar decryption of 'NOLAN' with key 7", "GHE:G", CryptoManager.caesarDecryption("NOLAN", 7));
    }


    @Test
    public void testBellasoEncryption() {
        assertEquals("Bellaso encryption of 'OPPENHEIMER' with Bellaso 'EIPXLDXQITF'", "49@=:,=:698", CryptoManager.bellasoEncryption("OPPENHEIMER", "EIPXLDXQITF"));
        assertEquals("Bellaso encryption of 'EINSTEIN' with Bellaso 'TSTYBTX'", "9<BL69AB", CryptoManager.bellasoEncryption("EINSTEIN", "TSTYBTX"));
        assertEquals("Bellaso encryption of 'STRAUSS' with Bellaso 'WYFEYFS'", "JM8&N9F", CryptoManager.bellasoEncryption("STRAUSS", "WYFEYFS"));
        assertEquals("Bellaso encryption of 'NOLAN' with Bellaso 'VXMGK'", "DG9(9", CryptoManager.bellasoEncryption("NOLAN", "VXMGK"));
    }

    @Test
    public void testBellasoDecryption() {
        assertEquals("Bellaso decryption of 'OPPENHEIMER' with Bellaso 'UUVEURUYNLU'", "PTZ3WR#X[(Q", CryptoManager.bellasoDecryption("EIPXLDXQITF", "UUVEURUYNLU"));
        assertEquals("Bellaso decryption of 'EINSTEIN' with Bellaso 'OSIVOPUS'", "% +#S$#", CryptoManager.bellasoDecryption("TSTYBTX", "OSIVOPUS"));
        assertEquals("Bellaso decryption of 'STRAUSS' with Bellaso 'WXYVYXW'", " !MO N\\", CryptoManager.bellasoDecryption("WYFEYFS", "WXYVYXW"));
        assertEquals("Bellaso decryption of 'NOLAN' with Bellaso 'UUVHU'", "!#W_V", CryptoManager.bellasoDecryption("VXMGK", "UUVHU"));
    }

    @Test
    public void testIsStringInBoundsValid() {
        assertTrue("String within bounds", CryptoManager.isStringInBounds("OPPENHEIMER"));
    }
}