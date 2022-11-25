# Palindrome

## The code

The code consisted of 4 classes that took in user String input to see if there is a palinedrome match against it

### Reversed organiser method
```java
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
```

### checkMatch() method that takes in the reversed word and checks if it matches the original
```java
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
```
### User input request
```java
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
```


