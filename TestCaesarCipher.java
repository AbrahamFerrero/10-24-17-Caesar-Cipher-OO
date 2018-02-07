import edu.duke.*;

/**
 * Write a description of TestCaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCaesarCipher {
    int[] countLetters(String message) {
       //This method counts the number of occurences of every letter of the alphabet in a given sentence "message" 
       String alph = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for(int i=0; i < message.length(); i++){
            char ch = Character.toLowerCase(message.charAt(i));
            int dex = alph.indexOf(ch);
            if(dex != -1){
                counts[dex] += 1;
            }
        }
        return counts;
    }
    
   public int maxIndex(int[] vals){
        /*This method takes the number that each caracter occurs (freqs),compares them and returns the 
         * int which is the number of the character (the index of the character) most repeated. 
         */
        int maxDex = 0;
        for(int i=0; i < vals.length; i++){
            if (vals[i] > vals[maxDex]){
                maxDex = i;
            }
        }
        return maxDex;
     }
   
   public void simpleTests(){
       FileResource f = new FileResource();
       String fAsString = f.asString();
       CaesarCipher cc = new CaesarCipher(18);
       String fEncrypted = cc.encrypt(fAsString);
       System.out.println("Encrypted message = " + fEncrypted);
       String fDecrypted = cc.decrypt(fEncrypted);
       System.out.println("Decrypted message = " + fDecrypted);
       /*cc = new CaesarCipher(INSERT KEY HERE);
       String fEncrypted = cc.encrypt(fAsString);
       System.out.println("Encrypted message = " + fEncrypted);
       String fDecrypted = cc.decrypt(fEncrypted);
       System.out.println("Decrypted message = " + fDecrypted);*/
    }
}
