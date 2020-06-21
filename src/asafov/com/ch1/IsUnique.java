package asafov.com.ch1;

import java.util.Arrays;
/**
 *
 * Problem: Implement an algorithm to determine if a string has all unique
 * characters. No extra data structure.
 *
 */

public class IsUnique {
    public boolean isUnique(String str){
        if (str==null || str.length()>256) return false;
        char[] arr = str.toCharArray();
        boolean[] ch = new boolean[256];
        for (char c : arr){
            if (ch[c]){
                return false;
            }
            ch[c]=true;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
