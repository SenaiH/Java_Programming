package day_13_CustomMethodContinue;

public class Task6FrequencyOfWord {
    public static void main(String[] args) {
 frequencyOfWord("I love Java Java Java  Java Java" ,"Java" );

    }
    public static void frequencyOfWord(String sentence,String word){
         int count = 0;
            if (sentence.contains(word)) {
                
                System.out.println(count);
            }


        }

}
/*
 Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */