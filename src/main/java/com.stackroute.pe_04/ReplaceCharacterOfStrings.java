package com.stackroute.pe_04;

public class ReplaceCharacterOfStrings {

        public static void main(String[] args) {
           ReplaceCharacterOfStrings.replaceCharacters();
        }

        private static void replaceCharacters() {
            String string = "daily dry";

            String string1=string.replace('d','f');
            String string2=string1.replace('l','t');

            System.out.println(" Input : " + string);
            System.out.println("Output : " + string1);
            System.out.println("Oiginal String : " + string);
            System.out.println("New String : " + string2);

    }
}
