package org.example;

import org.example.core.Cryptography;
import org.example.core.CryptographyIMPL;
import org.example.dicionary.Dicionary;
import java.util.Scanner;

public class MainEncrypt {

    public static void main(String[] args) {

        Cryptography encrypt = new CryptographyIMPL(new Dicionary());

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Entre com o texto claro: ");
                var textChiper = scan.nextLine();
                System.out.println("Texto cifrado:");
                System.out.println(encrypt.encrypt(textChiper));
                System.out.println("================================");
            }
        }
    }
}
