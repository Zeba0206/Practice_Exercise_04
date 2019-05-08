package com.stackroute.pe_04;

/*Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.*/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class IsWordPresent {

        public String presenceOfName(String str, String word) {

            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(str);

            if (matcher.find()) {
                System.out.println("Is " + word + " here? true");
            }else {
                System.out.println("Is " + word + " here? false");
            }
            return null;
        }


        /*Write a program with the implementation of Regular Expression to find the presence of the name
     Harry in a string.*/
        public static void main(String args[]) {

            IsWordPresent obj = new IsWordPresent();

            Scanner scn=new Scanner(System.in);
            obj.presenceOfName("httry","harry");
        }

    }


