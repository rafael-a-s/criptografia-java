package org.example.core;

public interface ColumnTransposition {

    String encrypt(String text, Integer[] key);
    String decrypt(String textCipher, Integer[] key);
}
