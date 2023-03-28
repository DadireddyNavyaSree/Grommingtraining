package com.navya;
import java.util.Arrays;

public class Anagram {

        public static boolean isAnagram(String str1, String str2) {
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if (str1.length() != str2.length()) {
                return false;
            }

            int[] charFrequency = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                charFrequency[str1.charAt(i) - 'a']++;
                charFrequency[str2.charAt(i) - 'a']--;
            }
            for (int i = 0; i < charFrequency.length; i++) {
                if (charFrequency[i] != 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String str1 = "Listen";
            String str2 = "Silent";

            if (isAnagram(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }
    }


