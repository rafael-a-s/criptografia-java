package org.example;
import org.example.core.ColumnTransposition;
import org.example.core.ColumnTranspositionIMPL;

public class Main {

    public static void main(String[] args) {

        ColumnTransposition algoritm = new ColumnTranspositionIMPL();

        String text = "Rafael Aguiar Silva";
        Integer[] key = {4, 3, 1, 2, 5}; // Defina a ordem das colunas aqui

        String cipherText = algoritm.encrypt(text, key);
        System.out.println("Texto Cifrado: " + cipherText);

        String decryptedText = algoritm.decrypt(cipherText, key);
        System.out.println("Texto Decifrado: " + decryptedText);
    }
}
