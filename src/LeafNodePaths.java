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
public class LeafNodePaths {
    
    Node root;
    Node[] stack;
    
    LeafNodePaths()
    {
        stack  = new Node[10];
    }
    public void printLeafNodePaths(Node node ,int index)
    {
      if(node == null ) return;
      
      stack[index++] = node;
      
      printLeafNodePaths(node.left,index);
      
      printLeafNodePaths(node.right,index);
      
      if(node.left==null && node.right== null)
      {
          printleaf(stack);
      }
    }
    
    void printleaf(Node[] stack)
            
    {
        for (Node stack1 : stack) {
            if(stack1 != null)
            System.out.print(stack1.data);
        }
       System.out.println("\n");
    }
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        LeafNodePaths tree_level = new LeafNodePaths();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        System.out.println("Leaf Node paths are - ");
        tree_level.printLeafNodePaths(tree_level.root,0);
    }
    
}
