package main.ceaserCipher;

public class CaesarCipherAdvanced {

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /*
        char c;
        for(c = 'a'; c <= 'z'; ++c)
           System.out.print(c + " ");
        }
    */

    public String encrypt(String plainText, int n) {
        
        String cipherText = "";
        
        for(int i=0; i < plainText.length(); i++){

            char charToEncypt = plainText.charAt(i);
            char replaceVal = ' ';

            if(charToEncypt != ' ') {
                int x = ALPHABET.indexOf(charToEncypt);
                int keyVal = (n+x) % 26;
                replaceVal = ALPHABET.charAt(keyVal);
            }

            cipherText += replaceVal;

        }

        return cipherText.toString();
        
    } 
    
}
