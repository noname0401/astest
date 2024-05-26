//import java.util.*;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//class Solution {
//    // Function to construct a binary tree from the given string input
//    public TreeNode constructBinaryTree(String input) {
//        if (input == null || input.isEmpty()) {
//            return null;
//        }
//
//        // Parse the input string and split into tokens
//        String[] tokens = input.replaceAll("[{}]", "").split(",");
//        Queue<TreeNode> queue = new LinkedList<>();
//
//        // Construct the root node from the first token
//        TreeNode root = new TreeNode(Integer.parseInt(tokens[0]));
//        queue.offer(root);
//
//        int index = 1;
//        while (!queue.isEmpty() && index < tokens.length) {
//            TreeNode current = queue.poll();
//
//            // Left child
//            if (!tokens[index].equals("#")) {
//                current.left = new TreeNode(Integer.parseInt(tokens[index]));
//                queue.offer(current.left);
//            }
//            index++;
//
//            // Check if there are more tokens
//            if (index >= tokens.length) break;
//
//            // Right child
//            if (!tokens[index].equals("#")) {
//                current.right = new TreeNode(Integer.parseInt(tokens[index]));
//                queue.offer(current.right);
//            }
//            index++;
//        }
//        return root;
//    }
//
//    // Function to find the lowest common ancestor (LCA) of two nodes in the binary tree
//    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
//        // Base case
//        if (root == null || root == p || root == q) {
//            return root;
//        }
//
//        // Recur for left and right subtrees
//        TreeNode leftLCA = findLCA(root.left, p, q);
//        TreeNode rightLCA = findLCA(root.right, p, q);
//
//        // If one of the children is in the left and the other is in the right, root is the LCA
//        if (leftLCA != null && rightLCA != null) {
//            return root;
//        }
//
//        // Otherwise, return the non-null child
//        return (leftLCA != null) ? leftLCA : rightLCA;
//    }
//
//    // Main function to demonstrate the usage of the above functions
//
//}
//public class test1{
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
//        // Example input
//        String input = "{1,#,2,3,#,#,4,#,#}";
//
//        // Construct the binary tree
//        TreeNode root = solution.constructBinaryTree(input);
//
//        // Define the nodes for which we want to find the LCA
//        TreeNode p = root; // Node with value 2
//        TreeNode q = root.right.right; // Node with value 4
//
//        // Find the LCA
//        TreeNode lca = solution.findLCA(root, p, q);
//
//        // Output the value of the LCA node
//       // System.out.println("Lowest common ancestor of nodes " + p.val + " and " + q.val + " is node with value: " + lca.val);
//        System.out.println(lca.val);
//    }
//}
class Solution {
    // Function to find the lowest common ancestor (LCA) of two nodes in the binary tree
    public int findLCA(String input, int pVal, int qVal) {
        if (input == null || input.isEmpty()) {
            return -1; // Invalid input
        }

        // Parse the input string and split into tokens
        String[] tokens = input.replaceAll("[{}#]", "").split(",");
        int n = tokens.length;
        int pIndex = -1, qIndex = -1;

        // Find the indices of the nodes with values pVal and qVal
        for (int i = 0; i < n; i++) {
            if (!tokens[i].isEmpty() && Integer.parseInt(tokens[i]) == pVal) {
                pIndex = i;
            }
            if (!tokens[i].isEmpty() && Integer.parseInt(tokens[i]) == qVal) {
                qIndex = i;
            }
        }

        // Check if both nodes exist in the tree
        if (pIndex == -1 || qIndex == -1) {
            return -1; // One or both nodes not found
        }

        // Find the lowest common ancestor (LCA) index
        while (pIndex != qIndex) {
            if (pIndex > qIndex) {
                pIndex = (pIndex - 1) / 2; // Move pIndex up one level
            } else {
                qIndex = (qIndex - 1) / 2; // Move qIndex up one level
            }
        }

        // Return the value of the lowest common ancestor (LCA)
        return Integer.parseInt(tokens[pIndex]);
    }


}
public class test1{
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        String input = "{1,#,2,3,#,#,4,#,#}";
        int pVal = 1;
        int qVal = 4;

        // Find the lowest common ancestor (LCA)
        int lca = solution.findLCA(input, pVal, qVal);

        // Output the value of the LCA
        System.out.println("Lowest common ancestor of nodes " + pVal + " and " + qVal + " is node with value: " + lca);
    }
}