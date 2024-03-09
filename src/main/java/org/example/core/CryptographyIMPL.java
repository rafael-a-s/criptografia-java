package org.example.core;

import java.util.Random;

import org.example.dicionary.Dicionary;

public class CryptographyIMPL implements Cryptography {

    private Dicionary dicionary;

    public CryptographyIMPL(Dicionary dicionary) {
        this.dicionary = dicionary;
    }

    public CryptographyIMPL() {
    }

    @Override
    public String encrypt(String text) {

        var arraySubStrings = cleanTextAndSplit(text);
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : arraySubStrings) {

            for (int i = 0; i < word.length(); i++) {
                var letter = String.valueOf(word.charAt(i));
                var letterCipher = getDicionary().getCharacters(letter);

                stringBuilder.append(letterCipher);
                stringBuilder.append(new Random().nextInt(100));
            }
            stringBuilder.append("L");

        }

        return stringBuilder.toString();
    }

    String[] cleanTextAndSplit(String text) {
        String textClean = text.trim();
        return textClean.split(" ");
    }

    String[] cleanTextCipherAndSplit(String textCipher) {
        return textCipher.split("L");
    }

    String[] wordCipherSplit(String wordCipher) {

        return wordCipher.split("\\d+");
    }

    @Override
    public String decrypt(String textCipher) {
        var arraySubStrings = cleanTextCipherAndSplit(textCipher);
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : arraySubStrings) {
            var arraySubLetterCipher = wordCipherSplit(word);
            for (String letterChiper : arraySubLetterCipher) {
                var letter = getDicionary().getLetterUpperCaseForTheIndex(letterChiper.length() - 1);
                var letterCipherCompare = this.getDicionary().getCharacters(letter);
                if (letterChiper.equals(letterCipherCompare)) {
                    stringBuilder.append(letter);
                } else {
                    stringBuilder.append(getDicionary().getLetterLowCaseForTheIndex(letterChiper.length() - 1));
                }

            }

            stringBuilder.append(" ");

        }

        return stringBuilder.toString().trim();
    }

    public Dicionary getDicionary() {
        return dicionary;
    }

    public void setDicionary(Dicionary dicionary) {
        this.dicionary = dicionary;
    }
}
