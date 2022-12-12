package org.example;

public class AlternatingLetters {
    public static void main(String[] args) {
        String s1 = "Spongebob";
        String s2 = "spongebob";

        System.out.println(alternate(s1));
        System.out.println(alternate(s2));


    }

    // Exercise, fill out this method
    // ex: input -> Spongebob, output -> SpOnGeBoB
    // ex: input -> spongebob, output -> sPoNgEbOb
    public static String alternate(String s) {
        char[] chars = s.toCharArray();
        boolean isUpper = Character.isUpperCase(chars[0]);

        for (int i = 0; i < chars.length; i++) {
            if (isUpper) {
                chars[i] = Character.toLowerCase(chars[i]);
                isUpper = false;
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
                isUpper = true;
            }
        }
        return new String(chars);
    }
}
