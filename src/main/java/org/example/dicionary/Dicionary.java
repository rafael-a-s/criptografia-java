package org.example.dicionary;

public class Dicionary {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String characters = "n}#(3e'@yn@hzQ=3<J23<k&urS";

    public String getCharactersForTheIndex(int index) {
        if(index == 0 ) {
            return String.valueOf(this.characters.charAt(index));
        }
        return this.characters.substring(0 ,index + 1);
    }

    public String getLetterForTheIndex(int index) {
        return String.valueOf(this.alphabet.charAt(index));
        
    }

    public static void main(String[] args) {
        Dicionary d = new Dicionary();
        int index1 = d.alphabet.indexOf("R");
        int index2 = d.alphabet.indexOf("A");
        int index3 = d.alphabet.indexOf("F");
        int index4 = d.alphabet.indexOf("A");
        int index5 = d.alphabet.indexOf("E");
        int index6 = d.alphabet.indexOf("L");
        System.out.print(d.getCharactersForTheIndex(index1));
        System.out.print(d.getCharactersForTheIndex(index2));
        System.out.print(d.getCharactersForTheIndex(index3));
        System.out.print(d.getCharactersForTheIndex(index4));
        System.out.print(d.getCharactersForTheIndex(index5));
        System.out.print(d.getCharactersForTheIndex(index6));

        System.out.println();

        System.out.print(d.getLetterForTheIndex(index1));
        System.out.print(d.getLetterForTheIndex(index2));
        System.out.print(d.getLetterForTheIndex(index3));
        System.out.print(d.getLetterForTheIndex(index4));
        System.out.print(d.getLetterForTheIndex(index5));
        System.out.print(d.getLetterForTheIndex(index6));

    }
}
