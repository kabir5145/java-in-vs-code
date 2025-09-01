package com.company;

import java.util.Arrays;

class question_8 {
    public static void main(String[] args) {
       // Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

       String s = "abixce";
       char[] chars = s.toCharArray();
       Arrays.sort(chars);
       String sortedStr = new String(chars);
       System.out.println(sortedStr);
    }
}