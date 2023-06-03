import java.util.*;

public class Solution {

    /**
     * Performs level order traversal on the given binary tree and returns a list of lists
     * containing the node values for each level of the tree.
     *
     * @param root the root node of the binary tree
     * @return a list of lists containing node values for each level of the tree
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); // List to store the result

        if (root == null)
            return result; // If the tree is empty, return the empty result

        Queue<TreeNode> queue = new LinkedList<>(); // Queue for BFS
        queue.add(root); // Add the root node to the queue

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>(); // List to store node values at the current level
            int size = queue.size(); // Number of nodes at the current level

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll(); // Dequeue a node from the queue
                level.add(node.val); // Add the node value to the current level list

                if (node.left != null)
                    queue.add(node.left); // Enqueue the left child node
                if (node.right != null)
                    queue.add(node.right); // Enqueue the right child node
            }

            result.add(level); // Add the current level list to the result list
        }

        return result; // Return the result list
    }
}
