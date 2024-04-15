package islabexternal;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Des {
    public static void main(String[] argv) {
        try {
            System.out.println("Message Encryption Using DES Algorithm\n--------");
            
            // Generate DES key
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();
            
            // Initialize DES cipher for encryption
            Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            
            // Encrypt the plaintext message
            byte[] text = "Secret Information".getBytes();
            byte[] textEncrypted = desCipher.doFinal(text);
            
            // Display original message and encrypted message
            System.out.println("Original Message: Secret Information");
            System.out.println("Encrypted Message (Byte Format): " + textEncrypted);
            
            // Initialize DES cipher for decryption
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            
            // Decrypt the encrypted message
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);
            
            // Display decrypted message
            System.out.println("Decrypted Message: " + new String(textDecrypted));
            
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException 
                | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
    }
}
