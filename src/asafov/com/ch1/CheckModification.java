package asafov.com.ch1;

import java.util.HashMap;
import java.util.Map;

public class CheckModification {

    public static void main(String[] args) {
        System.out.println(new CheckModification().isMod("palex","pales"));
    }
    public boolean isMod(String s,String s2){
        if (Math.abs(s.length()-s2.length())>1) return false;
        if (s.equals(s2)) return true;
        boolean flag = false;
        char[] a1=s.toCharArray();
        char[] a2=s2.toCharArray();
        int i=0;
        if (a1.length==a2.length){
            while (i<a1.length){
                if (a1[i]!=a2[i]){
                    if (flag) return false;
                    flag=true;
                }
                i++;
            }
        }else if (a1.length>a2.length){
            int j=0;
            while (i<a1.length && j<a2.length){
                if (a1[i]!=a2[j]){
                    if (flag) return false;
                    flag=true;
                    i++;
                }else {
                    i++;
                    j++;
                }
            }
        }else{
            int j=0;
            while (i<a2.length && j<a1.length){
                if (a2[i]!=a1[j]){
                    if (flag) return false;
                    flag=true;
                    i++;
                }else {
                    i++;
                    j++;
                }
            }
        }
        return true;
    }
}
