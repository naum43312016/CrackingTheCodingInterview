package asafov.com.ch4;

public class IsBST {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(2);
        t.right = new TreeNode(7);
        t.left.left = new TreeNode(1);
        System.out.println(new IsBST().isBstTree(t));
    }

    public boolean isBstTree(TreeNode root){
        if (root==null) return true;
        return traverse(root,root.left,true) && traverse(root,root.right,false);
    }

    private boolean traverse(TreeNode root, TreeNode node, boolean side) {
        if (node==null) return true;
        if (side){ //left
            if (node.data>root.data) return false;
        }else {
            if (node.data<root.data) return false;
        }
        return traverse(node,node.left,true) && traverse(node,node.right,false);
    }
}
