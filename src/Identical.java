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
public class Identical {
    
    boolean result = false;
    
    public boolean areIdentical(Node a, Node b)
    {
        if(( a==null && b!=null) || ( b==null && a!=null)) return false;
        else 
        {
            if(a==null && b==null) return true;
            if(a.data == b.data) result= true;
        else return false;
        
        if(areIdentical(a.left, b.left)) result = true;
        else return false;
        
        if(areIdentical(a.right, b.right)) result = true;
        else return false;
        }
              
       return result;
    }
    
     boolean identicalTrees(Node a, Node b) {
         
        /*1. both empty */
        if (a == null && b == null) {
            return true;
        }
 
        /* 2. both non-empty -> compare them */
        if (a != null && b != null) {
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));
        }
 
        /* 3. one empty, one not -> false */
        return false;
    }
    
    public static void main(String[] args) {
 
        Identical tree = new Identical();
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        
        Node root2= new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(2);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        
        tree.areIdentical(root,root2);      
 
        System.out.println(" Identical = " + tree.result);
         
 
    }
    
}
