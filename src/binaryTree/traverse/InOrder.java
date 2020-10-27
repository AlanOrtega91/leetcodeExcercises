package binaryTree.traverse;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrder extends TraverseBinaryTree{
    public static void main(String[] args) {
        InOrder inOrder = new InOrder();
        TreeNode subLeft = new TreeNode(3);
        TreeNode right = new TreeNode(2,subLeft,null);
        TreeNode root = new TreeNode(1,null,right);
        inOrder.inorderTraversal(root);
    }

    private  void traverse(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }

        if (node.left != null){
            traverse(node.left,list);
        }

        list.add(node.val);

        if (node.right != null){
            traverse(node.right,list);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traverse(root,list);

        return list;
    }
}
