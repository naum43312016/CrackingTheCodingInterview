package asafov.com.ch1;

import java.util.Arrays;

/**
 *
 * Problem: Write a method to replace all spaces in a string with '%20 You may
 * assume that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform
 * this operation in place.) EXAMPLE Input: "Mr John Smith     ", 13 Output:
 * "Mr%20John%20Smith"
 */
public class ReplaceSpaces {

    public static String replace(String s){
        if (s==null || s.length()<1) return s;
        char[] ch = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<=j && ch[i]==' '){
            i++;
        }
        while (j>=0 && ch[j]==' '){
            j--;
        }
        int x=i;
        while (x<=j){
            if (ch[x]==' '){
                ch[x++]=128;
                while (x<=j && ch[x]==' '){
                    x++;
                }
            }
            x++;
        }
        StringBuilder str = new StringBuilder();
        while (i<=j){
            while (i<=j && ch[i]==' '){
                i++;
            }
            if (ch[i]==128){
                str.append("%20");
            }else {
                str.append(ch[i]);
            }
            i++;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String ans = replace("Mr John Smith     ");
        System.out.println(ans);
    }

}
