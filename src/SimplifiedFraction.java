/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayaggarwal
 */
public class SimplifiedFraction {
    
    public static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
     public static int lowestcm(int max, int min)
    {
        int x;
        int lcm= max*min;
        if(max  == min) return max;
        
        for(int i=1;i<=min;i++)
        {
         x=max*i; 
         if(x%min==0) 
          {
           lcm=x; 
           break; 
          }
         }
        return lcm;
    }
     
     static String[] fractionSum(String[] str) 
     {
        
        int n = 0;
        String[] output = new String[str.length];
        
        for(String frac : str )
            {
            
            int a1=0, a2=1,b1=0,b2=1;
            String[]  f = frac.split("\\+");
            if(f.length ==1)
            {
                String[] frac1 = f[0].split("/");
                if(frac1.length ==1)
                    a1=Integer.parseInt(frac1[0]) ;
                else{
                    a1=Integer.parseInt(frac1[0]) ;
             a2= Integer.parseInt(frac1[1]);
                }
                
                int lc = (a2>b2) ? lowestcm(a2,b2) : lowestcm(b2,a2);
            int m1 = lc / a2;
            int m2 = lc / b2;

            a1= a1*m1;
            b1 = b1*m2;
            int num = a1+b1;
            int gc = gcd(num  , lc);

            output[n++]= new String("Simplified fraction is  " + (num/gc) + "/"+ (lc/gc) );
                
            }
            else if (f.length ==2){
                
                String[] frac1 = f[0].split("/");
            String[] frac2 = f[1].split("/");
            
            if(frac1.length ==1)
                    a1=Integer.parseInt(frac1[0]) ;
                else{
                    a1=Integer.parseInt(frac1[0]) ;
             a2= Integer.parseInt(frac1[1]);
                }
            
            if(frac2.length==1)
                    b1=Integer.parseInt(frac2[0]) ;
                else{
                    b1=Integer.parseInt(frac2[0]) ;
             b2= Integer.parseInt(frac2[1]);
                }
            
                     
            int lc = (a2>b2) ? lowestcm(a2,b2) : lowestcm(b2,a2);
            int m1 = lc / a2;
            int m2 = lc / b2;

            a1= a1*m1;
            b1 = b1*m2;
            int num = a1+b1;
            int gc = gcd(num  , lc);

            output[n++]= new String("Simplified fraction is  " + (num/gc) + "/"+ (lc/gc) );
            }         
            }
            return output;
    }
    
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        //int aa[] = {1,2,3,5,6};
        int aa[] = {-1,0,2,-1,6};
        SimplifiedFraction ob = new SimplifiedFraction();
        int a1= 3;
        int a2= 4;
        int b1= 8;
        int b2= 6;
        /*
        int lc = (a2>b2) ? ob.lowestcm(a2,b2) : ob.lowestcm(b2,a2);
        int m1 = lc / a2;
        int m2 = lc / b2;
        
        a1= a1*m1;
        b1 = b1*m2;
        int num = a1+b1;
        int gc = ob.gcd(num  , lc);
        
        System.out.println("Simplified fraction is  " + (num/gc) + "/"+ (lc/gc) );
        
       */
        
        String s[]=  new String[]{"5" ,
"722/148+360/176" ,
"978/1212+183/183" ,
"358/472+301/417" ,
"780/309+684/988" ,
"258/840+854/686"};
        fractionSum(s);
        
    }
    
}
