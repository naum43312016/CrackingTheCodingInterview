package asafov.com.ch1;

import java.util.Arrays;

/**
 *
 * Problem: Given two strings, write a method to decide if one is a permutation
 * of other.
 *
 */
public class CheckPermutation {
    public boolean isPermutation(String str,String str2){
        int[] arr = new int[256];
        if (str.length() != str2.length()) return false;
        for (char c : str.toCharArray()){
            arr[c]++;
        }
        for (char c : str2.toCharArray()){
            if (--arr[c]<0) return false;
        }
        return true;
    }
}
