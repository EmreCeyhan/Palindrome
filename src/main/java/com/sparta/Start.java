package com.sparta;

import java.util.Scanner;

public class Start {
    private static String reversedWord;
    public void start()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        System.out.println("You have entered: "+str);

        Words w = new Words();
        reversedWord = w.wordOrganiser(str);
        Matcher result = new Matcher(str, reversedWord);
        result.checkMatch();
    }
}
