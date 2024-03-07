package org.example.core;

import org.example.dicionary.Dicionary;

public class CryptographyIMPL implements Cryptography {

    private Dicionary dicionary;

    CryptographyIMPL(Dicionary dicionary) {
        this.dicionary = dicionary;
    }

    public CryptographyIMPL(){}

    @Override
    public String encrypt(String text) {

        var arraySubStrings = cleanTextAndSplit(text);
        StringBuilder stringBuilder = new StringBuilder();

        for(String word : arraySubStrings) {

            for (int i = 0; i < word.length(); i++) {
                var letter = String.valueOf(word.charAt(i));
                var letterCipher = getDicionary().getCharacters(letter);

                stringBuilder.append(letterCipher);
            }
            stringBuilder.append("L");

        }

        return stringBuilder.toString();
    }

    String[] cleanTextAndSplit(String text) {
        String textClean = text.trim();
        return textClean.split(" ");
    }

    @Override
    public String decrypt(String textCipher) {
        return null;
    }


    public Dicionary getDicionary() {
        return dicionary;
    }

    public void setDicionary(Dicionary dicionary) {
        this.dicionary = dicionary;
    }
}
