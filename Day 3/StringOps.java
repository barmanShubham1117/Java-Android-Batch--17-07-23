// package Day 3;

import java.util.Scanner;

public class StringOps {
    public static void main(String[] args) {
        // int a = 23;

        String str = "Hello, how are you?";
        // String str = new String("I'm fine. What about you?");

        System.out.println(str);

        // to change case of strings
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        
        // slicing of a string
        // System.out.println(str.substring(7, 10));

        // string concatenation
        String str2 = "HaHaHa... hahaha..";
        System.out.println(str + str2);

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        System.out.println(inputStr);
        sc.close();        
        
    }
}
