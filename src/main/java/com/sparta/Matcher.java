package com.sparta;

public class Matcher {
    private String word;
    private String reversedWord;
    public Matcher(String word, String reversedWord)
    {
        this.word = word.replaceAll("\\s+","").toLowerCase();
        this.reversedWord = reversedWord;
    }

    public void checkMatch()
    {
        if(word.equals(reversedWord))
        {
            System.out.println("MATCH MADE! - " + word + " revered is also " + reversedWord);
        }
        else{
            System.out.println("No match here.... your word was " + word + ". Reversed version is " + reversedWord);
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getReversedWord() {
        return reversedWord;
    }

    public void setReversedWord(String reversedWord) {
        this.reversedWord = reversedWord;
    }
}
