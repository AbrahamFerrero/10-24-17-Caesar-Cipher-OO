import edu.duke.*;
/**
 * Write a description of TestCaesarCipherTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCaesarCipherTwo {
   
   public void simpleTests(){
       FileResource f = new FileResource();
       String fAsString = f.asString();
       CaesarCipherTwo cc = new CaesarCipherTwo(14,24);
       String fEncryptedTwo = cc.encrypt(fAsString);
       System.out.println("Encrypted message = " + fEncryptedTwo);
       String fDecryptedTwo = cc.decrypt(fEncryptedTwo);
       System.out.println("Decrypted message = " + fDecryptedTwo);
    }
   
   
   
}
