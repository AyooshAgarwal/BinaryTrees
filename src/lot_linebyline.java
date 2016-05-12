/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytrees;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author ayaggarwal
 * 
 */
public class lot_linebyline {
    
Node root;
 
    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
     void printLevelOrder(Node root)
{
    // Base Case
    if (root == null)  return;
     // Create an empty queue for level order tarversal
   Queue<Node> q = new LinkedList<Node>();
     // Enqueue Root and initialize height
    q.add(root);
     while (true)
    {
        // nodeCount (queue size) indicates number of nodes
        // at current lelvel.
        int nodeCount = q.size();
        if (nodeCount == 0)
            break;
         // Dequeue all nodes of current level and Enqueue all
        // nodes of next level
        while (nodeCount > 0)
        {
            Node node = q.peek();
            System.out.print(node.data + " ");
            q.poll();
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
            nodeCount--;
        }
        System.out.print("\n");
    }
}
 
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        lot_linebyline tree_level = new lot_linebyline();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder(tree_level.root);
    }
}
