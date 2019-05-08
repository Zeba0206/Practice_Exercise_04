package com.stackroute.pe_04;

import java.sql.SQLOutput;

public class StringBasic {
    public static void main(String args[]){
        StringBasic.stringBasic();

    }

    public static void stringBasic(){
        String v1=new String("Zeba mohammad ");
        String v2=new String("Rafique Sheikh ");


        System.out.println("string1 :"+v1);
        System.out.println("string2 :"+v2);
        System.out.println("str1 lowercase :" + v1.toLowerCase());
        System.out.println("str1 uppercase : " + v1.toUpperCase());
        System.out.println("str2 Upper case :" + v2.toUpperCase());
        System.out.println("str2 lowercase" + v2.toLowerCase());
        System.out.println("str2 replace 'a' into 'i' : " + v1.replace('a','i'));
        System.out.println("concate of str1 & str2 :" + v1.concat(v2));
        System.out.println("trim str 2 : " + (v1.trim()).concat(v2));
        System.out.println("str1&str2 equals : " + v1.equals(v2));
        System.out.println("str length :" + v1.length());
        System.out.println("comparison betn str1 and str2 :" + v1.compareTo(v2));
        System.out.println("str1 in 2 position substring :" + v1.substring(2));
        System.out.println("str2 in 2 to 4th position substring :" + v2.substring(2, 4));
        System.out.println("str1 index of a : " +v2.indexOf('a'));
        System.out.println("str1 index of e in 2 : " + v2.indexOf('e',2));

    }
}
