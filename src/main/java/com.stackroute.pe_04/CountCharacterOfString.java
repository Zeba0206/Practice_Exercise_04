package com.stackroute.pe_04;

import java.util.Scanner;

/*Write a java program to count the total number of occurrences of a given character in a string
without using any loop?
Input : Java is java again java again count number of occurrence of a in the given string*/

public class CountCharacterOfString{

    public static void main(String[] args) {
        CountCharacterOfString.countCharacters();
    }

    private static void countCharacters() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String string=scan.nextLine();

        System.out.println("Enter Character: ");
        String character=scan.nextLine();
        int count;

        //counting the occurrence of 'a'
        int charcount = string.length() - string.replaceAll(character, "").length();
        System.out.println("Occurrence Of " +character+ " Char In String: " + charcount);
    }
}