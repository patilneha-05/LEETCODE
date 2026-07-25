/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void postorder(TreeNode root, List<Integer> tree){

        if(root != null){
            postorder(root.left, tree);
            postorder(root.right, tree);
            tree.add(root.val);
        }

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        postorder(root, tree);
        return tree;
    }
}