package com.example.lib;
import java.util.Scanner;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letters");
        String s = scanner.next();
        for(int i=0;i<s.length();i++) {
            char c= s.charAt(i);
            if (isUpperCase(c))
                System.out.print(toLowerCase(c));
            else if(isLowerCase(c))
                System.out.print(toUpperCase(c));
            System.out.println(" ");
        }
    }
}
