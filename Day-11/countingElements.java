package Day11;

import java.util.Scanner;

public class countingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something :");
        String str = sc.nextLine();
        CountElements(str);
        sc.close();
    }
    public static void CountElements(String str){
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int specialCount = 0;
        int vowelCount = 0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            if(Character.isLowerCase(ch)){
                lowerCount++;
            }
            if(Character.isDigit(ch)){
                digitCount++;
            }
            if(!Character.isLetterOrDigit(ch)){
                specialCount++;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowelCount++;
            }
        }
        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special characters: " + specialCount);
        System.out.println("Vowels: " + vowelCount);
    }
}
