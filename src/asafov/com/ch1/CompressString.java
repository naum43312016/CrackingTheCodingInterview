package asafov.com.ch1;

public class CompressString {

    public String compress(String s){
        StringBuilder str = new StringBuilder();
        char[] arr = s.toCharArray();
        int i = 0;
        while (i<arr.length){
            char c = arr[i];
            int count = 0;
            while (i<arr.length && arr[i]==c){
                i++;
                count++;
            }
            str.append(c +""+ count);
        }
        if (str.length()>=s.length()) return s;
        return str.toString();
    }
}
