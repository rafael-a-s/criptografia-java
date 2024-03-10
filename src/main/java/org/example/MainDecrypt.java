package org.example;

import org.example.core.CryptographyIMPL;
import org.example.dicionary.Dicionary;
import java.util.Scanner;

public class MainDecrypt {

    public static void main(String[] args) {
        CryptographyIMPL decrypt = new CryptographyIMPL(new Dicionary());
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Entre com o texto cifrado: ");
                var textChiper = scan.nextLine();
                System.out.println("Texto claro:");
                System.out.println(decrypt.decrypt(textChiper));
                System.out.println("================================");
            }
        }
    }
}
