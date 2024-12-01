import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        
        int len = name.length();
        int Count_vowel = 0;
        
        for( int i = 0 ; i < len ; i++){
            char alphabet = name.charAt(i);
            if( alphabet == 'a' || alphabet == 'i' || alphabet== 'o' || alphabet == 'e' || alphabet == 'u' ){
                Count_vowel++;
            }
        }
        System.out.println("Total number of vowel:" +Count_vowel);
        int Count_consonants = len - Count_vowel;
        System.out.println("Total number of consonants:" +Count_consonants);
    }
};
