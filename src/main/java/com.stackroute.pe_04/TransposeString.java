package com.stackroute.pe_04;

/*Write a program to transpose the given string.
Input String : a quick brown fox jumps over the lazy dog
Output String: a kciuq nworb xof spmuj revo eht yzal god*/


import java.util.Scanner;

public class TransposeString {

    public static void main(String args[])
    {
        TransposeString.transpose();
    }

    public static void transpose()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String string=scan.nextLine();

        String arrayWord[]=string.split(" ");
        String reverseString="";

        for(int i=0;i<arrayWord.length;i++)
        {
            String word=arrayWord[i];
            String reverseWord="";

            for(int j=word.length()-1;j>=0;j--)
            {
                reverseWord=reverseWord+word.charAt(j);
            }
            reverseString=reverseString+reverseWord+" ";
        }
        System.out.println("Original String: "+string);
        System.out.println("String after transpose: "+reverseString);
    }
}
