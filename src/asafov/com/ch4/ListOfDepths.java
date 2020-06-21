package asafov.com.ch4;

import java.util.ArrayList;
import java.util.List;

public class ListOfDepths {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        List<List<TreeNode>> l = new ListOfDepths().createList(t);
        for (List<TreeNode> n : l){
            for (TreeNode tr : n){
                System.out.print(tr.data +" ");
            }
            System.out.println();
        }
    }

    public List<List<TreeNode>> createList(TreeNode root){
        List<List<TreeNode>> list = new ArrayList<>();
        traverse(list,0,root);
        return list;
    }

    private void traverse(List<List<TreeNode>> list, int i, TreeNode root) {
        if (root==null) return;
        if (i>=list.size()){
            List<TreeNode> l = new ArrayList<>();
            list.add(l);
        }
        list.get(i).add(root);
        traverse(list,i+1,root.left);
        traverse(list,i+1,root.right);
    }
}
