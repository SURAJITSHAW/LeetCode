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

// NOTE: This is the iterative implementation.

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // create a dynamic array to store all traversed nodes
        List<Integer> preOrder = new ArrayList<> ();
        if (root == null) return preOrder;
        // otherwise create a "stack" data structure to keep track of the nodes
        Stack<TreeNode> st = new Stack<> ();
        // intially put root in the stack
        st.push(root);
        // Now untill stack is empty keep running
        while(!st.isEmpty()) {
            root = st.pop();
            preOrder.add(root.val);
            // now if root has children, then push right child first and left second. Cuz preOrder means [root, left, right]
            if (root.right != null) st.push(root.right);
            if (root.left != null) st.push(root.left);
        }
        return preOrder;
    }
}