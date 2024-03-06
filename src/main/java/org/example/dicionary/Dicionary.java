package org.example.dicionary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dicionary {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String characters = "yn}#(3e'@yn@hzQ=3<J23<k&urS";

    public String getCharactersForTheIndex(int index) {
        return this.characters.substring(this.characters.length() -1 ,index);
    }

    public static void main(String[] args) {
        Dicionary d = new Dicionary();

        System.out.println(d.getCharactersForTheIndex(1));
    }
}
