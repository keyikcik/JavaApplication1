/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author kyk
 */
public class donguLoop {
    public static void main(String[] args){
        for( int r=0; r<20; r+=2){
            System.out.println(" "+r);
        }
        for( int r=1; r<20; r+=2){
            System.out.println(" "+r);
        }
        //100 den 1 e kadar olan tek sayılar        
        for( int r=100; r>0; r--){
            if(r%2==1){
                    System.out.println(" "+r);
            }
        }
        
        /* other way         
        for (int r=99; r>=1; r-=2){
            System.out.println(r);
        }
        */
        /*other way2
        for (int r=0; r<50; r++){
            System.out.println("  "+ (100-(2*r+1)));
        }
        */

        
        //0-100 arasında hem 3 ve 7 ye bölünebilen sayılar
        for(int r=0;r<=100;r++){
            if(r%3==0 && r%7==0){
                System.out.println("0-100 %3and7    ="+r);
                
            }
        }
        /*other way
        for(int r=1; r<100;r++){
            if(r%21==0){
                System.out.println("    "+r);
            }
        }
        */
        /*other way2
        for(int r=0; r<4; r++){
            System.out.println("   "+(r+1)*21);
        }
        */
        
        //2 4 16 32.. 2^nin üsleri
        for(int r=1; r<100;r*=2){                  
            System.out.println("üst "+r);
        }
        /* other way
        int us=1;
        for(int r=0; r<7;r++){
            System.out.println("üst "+us);
            us=us*2;             
        }
        */
        /*other way 2
        for(int r=0; r<7;r++){
            System.out.println("üst   "+(int)Math.pow(2, r));            
        }
        */
        // BREAK
        for(int r=0; r<10 ;r++){
            System.out.println("--------");
            if(r==5){
                break; //5 görünce döngüyü kırar
            }
            System.out.println(r);          
                               
        } 
        System.out.println("always writing!");
       
        // CONTINUE
         for(int r=0; r<10 ;r++){
            System.out.println("--------");
            if(r==5){
                continue; //sadece 5 i yazmaz!
            }
            System.out.println(r);          
                               
        } 
        System.out.println("always writing!");
        
        
     }
    
}
