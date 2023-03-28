//package com.navya;
//
//
//
//
//// Helper method to check if a string is a palindrome
//
//
//public class removePalindromeSubsequence {
//    public static String removePalindromeSubsequence(String s) {
//        // If input string is empty, return it as is
//        if (s.isEmpty()) {
//            return s;
//        }
//
//        // Check if input string is already a palindrome
//        if (isPalindrome(s)) {
//            return "";
//        }
//
//        // Remove all palindrome subsequences from the string
//        StringBuilder sb = new StringBuilder(s);
//        int i = 0;
//        int j = sb.length() - 1;
//
//        while (i < j) {
//            if (sb.charAt(i) == sb.charAt(j)) {
//                sb.deleteCharAt(j);
//                sb.deleteCharAt(i);
//                j = sb.length() - 1;
//            } else {
//                i++;
//            }
//        }
//
//        return sb.toString();
//    }
//
//    public static boolean isPalindrome(String s) {
//        int i = 0;
//        int j = s.length() - 1;
//
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//
//        return true;
//    }
//    String s = "abbaaccddee";
//    String result = removePalindromeSubsequence(s);
//System.out.println(result); // Output: "acd"
//}
