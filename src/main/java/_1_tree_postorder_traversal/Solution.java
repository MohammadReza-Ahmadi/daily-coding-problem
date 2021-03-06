package _1_tree_postorder_traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /* you only have to complete the function given below.
    Node is defined as

    class Node {
        int data;
        Node left;
        Node right;
    }

    */
    public static void postOrder(Node root) {
        for (Integer i : postOrderInner(root, new ArrayList<>())) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static List<Integer> postOrderInner(Node root, List<Integer> preorder) {
        if (root == null)
            return preorder;

        postOrderInner(root.left, preorder);
        postOrderInner(root.right, preorder);
        preorder.add(root.data);
        return preorder;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }
}