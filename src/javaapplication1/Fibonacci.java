/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kyk
 */

class Fibonacci{
    static final int MAX_INDEX=10;
    
    public static void main(String[] args){
        int lo=1;
        int hi=1;
        System.out.println(lo);
        while(hi<50){
            System.out.println(hi);
            hi=hi+lo;
            lo=hi-lo; //new lo is (sum-old lo)
        }
         
        System.out.println("With another way : ");
        int a=1;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<10;i++){
            c=a+b;
            a=b;
            b=c; 
            if (c%2!=0)
                System.out.println(c);   
            else
                System.out.println(c+"*");
        }
        
        
        
         System.out.println("IMPROVED FIBONACCI");
         String mark;
         hi=1;
         lo=1;
         System.out.println("1:   "+lo);
         for(int f=2; f<MAX_INDEX;f++){
             if(hi%2==0)
                 mark=" *";
             else
                 mark="  ";                 
             System.out.println(f+":   "+hi+mark);
             hi=lo+hi;
             lo=hi-lo;
         }
         
        
    System.out.println("Fbonacci with Array: ");
    int fib[] = new int [10];
    fib[0]=1;
    fib[1]=1;
    for (int i=0;i<8;i++){
        fib[i+2]=fib[i+1]+fib[i];
    }
    for (int i=0;i<10;i++){
        System.out.println(fib[i]);
    }
     
         
    }
        
}

