package org.example;
import org.example.core.Cryptography;
import org.example.core.CryptographyIMPL;

public class Main {

    public static void main(String[] args) {

        Cryptography algoritm = new CryptographyIMPL();

        String text = "Rafael Aguiar Silva";
        Integer[] key = {4, 3, 1, 2, 5}; // Defina a ordem das colunas aqui

        String cipherText = algoritm.encrypt(text);
        System.out.println("Texto Cifrado: " + cipherText);

        String decryptedText = algoritm.decrypt(cipherText);
        System.out.println("Texto Decifrado: " + decryptedText);
    }
}
