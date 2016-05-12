/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytrees;
// Iterative Queue based Java program to do level order traversal
// of Binary Tree
 
/* importing the inbuilt java classes required for the program */
import java.util.Queue;
import java.util.LinkedList;

class queue
{
    Node first , last ; 
    
    
    queue()
    {
        first = null;
        last = null;
    }
    Node newnode(int data)
    {
        Node node=  new Node(data);
        node.left= null;
        node.right = null;
        return node;
    }
    void enqueue(int data)
    {
        if(first==null)
        {
            first = newnode(data);
            last= first;
        }
        else{
        Node temp = newnode(data);
        last.left = temp;
        last= temp;
        }
    }
    int dequeue()
    {
        int data = first.data;
        Node temp = first.left;
        first= null;
        first = temp;
        if(first == null) last = null;
        return data;
    }
    
    boolean isempty()
    {
        return first==null;
    }
}

class queue1
{
    int  first , last ,size,N; 
    Node[] q;
    
    
    queue1(int N)
    {
        first = -1;
        last = 0;
        size=0;
        q= (Node[])new Node[N];
        this.N = N;
        
    }
   
    void enqueue(Node data)
    {
        if(size == N)
        {
            return;
        }
        else if(size ==0)
        {
            first++;
            q[last++] = data;
            size++;
        }
        else 
        {
            q[last++] = data;
            size++;
        }
    }
    Node dequeue()
    {
        if(size == 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Underflow");
        }
        Node temp = q[first];
        q[first]= null;
        first++;
        size--;  
        if(size == 0)
        {
            first = -1;
            last =0;
        }
        return temp;
    }
    
    boolean isempty()
    {
        return size==0;
    }
    
    int qsize()
    {
        return size;
    }
}
 
/* Class to print Level Order Traversal */
class levelordertraversal {
 
    Node root;
    int treesize=0;
 
    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder() 
    {
        if(root == null) return;
        
        queue1 myq = new queue1(50);
        myq.enqueue(root);
        treesize++;
        while (!myq.isempty()) 
        {
            Node tempNode = myq.dequeue();
            System.out.print(tempNode.data + " ");
 
            /*Enqueue left child */
            if (tempNode.left != null) {
                myq.enqueue(tempNode.left);
                treesize++;
            }
 
            /*Enqueue right child */
            if (tempNode.right != null) {
                myq.enqueue(tempNode.right);
                treesize++;
            }
        }
    }
 
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        levelordertraversal tree_level = new levelordertraversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
        System.out.println("\nSize of binary tree is  "+ tree_level.treesize);
    }
}
