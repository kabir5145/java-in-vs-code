package com.company;

import java.util.Scanner;

public class question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String v[] = {"a","e","i","o","u"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isVowel = false;
            for (String vowel : v) {
                if (String.valueOf(ch).equalsIgnoreCase(vowel)) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
