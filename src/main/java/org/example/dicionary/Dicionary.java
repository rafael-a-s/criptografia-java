package org.example.dicionary;

public class Dicionary {

    final String alphabetUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    final String alphabetLowCase = "abcdefghijklmnopqrstuvwxyz";

    final String charactersUpperCase = "n}#(!e'@yn@hzQ=<%J¨[<k&urS";

    final String charactersLowCase = "<Juh[@S&!¨knz=en'r@<Q&y#}(";

    public String getCharacters(String letter) {
        if (letter.equals(letter.toLowerCase())) {
            return getCharactersLowCase(letter);
        }

        return getCharactersUpperCase(letter);
    }

    String getCharactersLowCase(String letter) {
        var index = alphabetLowCase.indexOf(letter);
        if (index == 0) {
            return String.valueOf(this.charactersLowCase.charAt(index));
        }

        return this.charactersLowCase.substring(0, index + 1);
    }

    String getCharactersUpperCase(String letter) {
        var index = this.alphabetUpperCase.indexOf(letter);
        if (index == 0) {
            return String.valueOf(this.charactersUpperCase.charAt(index));
        }

        return this.charactersUpperCase.substring(0, index + 1);
    }

    public String getLetterUpperCaseForTheIndex(int index) {
        return String.valueOf(this.alphabetUpperCase.charAt(index));
    }

    public String getLetterLowCaseForTheIndex(int index) {
        return String.valueOf(this.alphabetLowCase.charAt(index));
    }

}
