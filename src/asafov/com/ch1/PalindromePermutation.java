package asafov.com.ch1;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public boolean isPerm(String s) {
        if (s == null) {
            return false;
        }
        int countOdd = 0;
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
                if (counts[c - 'a'] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd < 2;
    }
}
