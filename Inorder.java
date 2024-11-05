import java.util.*;

public class Inorder{


    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        return inHelper(root,list);
    }

    public List<Integer> inHelper(TreeNode root,List<Integer> list){
        if(root==null){
            return list;
        }

        inHelper(root.left,list);

        list.add(root.val);

        inHelper(root.right,list);

        return list;

    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Instantiate the Inorder class
        Inorder inorderTraversal = new Inorder();

        // Call the inOrderTraversal method
        List<Integer> result = inorderTraversal.inOrderTraversal(root);

        // Print the result
        System.out.println("Inorder Traversal: " + result);
    }
}


// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         inorderHelper(root, result);
//         return result;
//     }

//     private void inorderHelper(TreeNode node, List<Integer> result) {
//         if (node != null) {
//             // Traverse the left subtree
//             inorderHelper(node.left, result);
//             // Visit the root (current node)
//             result.add(node.val);
//             // Traverse the right subtree
//             inorderHelper(node.right, result);
//         }
//     }
// }
