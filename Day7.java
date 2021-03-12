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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        
        if(root==null)
            return root;
        
        if(d==1){
            TreeNode nn = new TreeNode(v);
            nn.left=root;
            root=nn;
            return root;
        }
        
        if(d==2){
            TreeNode n1 = new TreeNode(v);
            TreeNode n2 = new TreeNode(v);
            
            n1.left=root.left;
            n2.right=root.right;
            root.left=n1;
            root.right=n2;
            return root;
        }
        
        root.left=addOneRow(root.left,v,d-1);
        root.right=addOneRow(root.right,v,d-1);
        
        // helper(root,v,d,d);
        return root;
    }
    
  
}