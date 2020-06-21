package asafov.com.ch2;

public class SumLists {

    public Node sum(Node one,Node two){
        if (one==null || two==null) return null;
        String s1 = "";
        String s2 = "";
        while (one!=null){
            s1 = one.data + s1;
            one=one.next;
        }
        while (two!=null){
            s2 = two.data + s2;
            two=two.next;
        }
        int f = Integer.parseInt(s1);
        int t = Integer.parseInt(s2);
        int res = f+t;
        char[] ans = String.valueOf(res).toCharArray();
        int i=ans.length-1;
        Node answer = new Node();
        if (i>=0){
            answer.data=Character.getNumericValue(ans[i--]);
        }
        Node tmp = answer;
        while (i>=0){
            tmp.next =new Node(Character.getNumericValue(ans[i--]));
            tmp=tmp.next;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a1={7,1,6};
        int[] a2={5,9,2};
        Node n1 = new Node().createList(a1);
        Node n2 = new Node().createList(a2);
        Node ans = new SumLists().sum(n1,n2);
        ans.print(ans);
    }
}
