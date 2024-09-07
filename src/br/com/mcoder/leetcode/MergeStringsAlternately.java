package br.com.mcoder.leetcode;

import java.util.Scanner;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        // For every index in the strings
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {

            // First choose the ith character of the
            // first string if it exists
            if (i < word1.length())
                result.append(word1.charAt(i));

            // Then choose the ith character of the
            // second string if it exists
            if (i < word2.length())
                result.append(word2.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();
        String result = mergeAlternately(word1, word2);

        System.out.println("word1 = " + word1 + ", word2 = " + word2);
        System.out.println(word1 + word2);
        System.out.println(result);
    }
}
