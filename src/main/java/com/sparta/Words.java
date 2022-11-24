package com.sparta;

public class Words {
    private String word = "Hannah";
    private String reversed;

    public String wordOrganiser(String newWord)
    {
        this.word = newWord;
        char[] characters = word.replaceAll("\\s+","").toLowerCase().toCharArray();
        for (int i = characters.length - 1; i >= 0;)
        {
            reversed = reversed + characters[i];
            i = i - 1;
        }
        reversed = reversed.replaceAll("null", "");
        return reversed;
    }

    public String getWord() {
        return word.toLowerCase();
    }

    public void setWord(String word) {
        this.word = word.toLowerCase();
    }
}
