package asafov.com.ch4;

public class MinimalTree {

    public static void main(String[] args) {
        int[] arr = {1,2,3,10,4};
        TreeNode tree = createBST(arr,0,arr.length-1);
        System.out.println(tree);
    }

    private static TreeNode createBST(int[] arr,int i,int j) {
        if (i<=j){
            int mid = (i+j)/2;
            TreeNode node = new TreeNode(arr[mid]);
            node.left = createBST(arr,i,mid-1);
            node.right = createBST(arr,mid+1,j);
            return node;
        }else {
            return null;
        }
    }
}
