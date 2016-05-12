/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytrees;

/**
 *
 * @author ayaggarwal
 */
public class MirrorTree {
    
    Node root;
    
    public void mirror(Node node)
    {
        if(node == null) return ;
        mirror(node.left);
        mirror(node.right);
        
        Node lst = node.left;
        Node rst = node.right;
        node.left = rst;
        node.right = lst;
    }
    
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        MirrorTree tree_level = new MirrorTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
       
        tree_level.mirror( tree_level.root);
        lot_linebyline tree_level_order = new lot_linebyline();
        tree_level_order.root = tree_level.root;
        System.out.println("Level order traversal of the mirror tree is - ");
        tree_level_order.printLevelOrder(tree_level_order.root);
        
    }
    
}
