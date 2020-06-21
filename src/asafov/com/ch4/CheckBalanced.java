package asafov.com.ch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckBalanced {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        boolean b = new CheckBalanced().checkIfTreeIsBalanced(t);
        System.out.println(b);
    }
    public boolean checkIfTreeIsBalanced(TreeNode root){
        List<Integer> list = new ArrayList<>();
        traverse(list,0,root);
        if (list.size()<2) return true;
        Collections.sort(list);
        if (Math.abs(list.get(0)-list.get(list.size()-1))>1) return false;
        return true;
    }
    private void traverse(List<Integer> list,int level, TreeNode root) {
        if (root==null){
            list.add(level);
            return;
        }
        traverse(list,level+1,root.left);
        traverse(list,level+1,root.right);
    }
}
