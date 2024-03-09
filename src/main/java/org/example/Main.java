package org.example;

import org.example.core.Cryptography;
import org.example.core.CryptographyIMPL;
import org.example.dicionary.Dicionary;

public class Main {

    public static void main(String[] args) {

        Cryptography algoritm = new CryptographyIMPL(new Dicionary());

        String text = "Rafael Aguiar Silva";

        String cipherText = algoritm.encrypt(text);
        System.out.println("Texto Cifrado: " + cipherText);

        String decryptedText = algoritm.decrypt(cipherText);
        System.out.println("Texto Decifrado: " + decryptedText);
    }
}
