/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayaggarwal
 */
public class SubArrays {
    
    
    
     public static int countsubArray(int[] arr )
     {
         int count =0;
         int len  = arr.length;
         
         for(int i=0 ; i< len ; i++)
         {
             int p = arr[i];
             for(int j=i+1 ; j< len ; j++)
             {
                 if(p+1 == arr[j])
                 {
                     count++;
                     p++;
                 }
                 else
                 {
                     break;
                 }
             }
         }
         return count;
     }
     
     static long kSub(int k, int[] nums) 
     {
         return 0;
         
     }

    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        //int aa[] = {1,2,3,5,6};
        int aa[] = {1,2,3,4,1};
        SubArrays ob = new SubArrays();
 
        System.out.println("No. of Subarrays are " + ob.countsubArray(aa));
        
    }
}
