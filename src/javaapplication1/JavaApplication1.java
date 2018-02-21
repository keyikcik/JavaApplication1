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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World! I am Arya :)");
        int a = 10;
        int b=a;
        a=100;
        System.out.println("a: "+a+"  b: "+b);
        String c ;
        c = "My name is arya tan";
        System.out.println(c);
        c=c.toUpperCase();
        System.out.println(c); 
        int firstSpace = c.indexOf(" ");
        String firstS=c.substring(0, firstSpace);
        System.out.println(firstS);
        System.out.println(c.substring(firstSpace));
        int lastSpace=c.lastIndexOf(" ");
        String LastS=c.substring(lastSpace);
        System.out.println("Last Sentence: "+LastS);
        // kelime kelime nasıl yazdırılacağını öğrenince yap!!!
        
        //diziler ARRAY
        int x[] = new int[5];
        x[2]=120;
        int y[] = {1,3,5,7,9};
        String z[]={"one", "two", "tree", "four", "five"};
        System.out.println(x[3]+z[0]+y[1]+z[4]+x[2]);
        
        //oparatorler
        System.out.println("result1: "+ (a+b));
        System.out.println("result2: "+ a+b);
        System.out.println("result3: "+ a*b);
        System.out.println("result4: "+ (float)((float)a/(float)b));
        System.out.println("result5: "+ (a>>2));
        System.out.println("result6: "+ (a<<2));
        System.out.println("result7: "+ (a<b));
        System.out.println("result8: "+ (a!=b));
        
        // Loops Döngüler
        for(int i=0;i<10;i++){
            System.out.println(i+".Message");
        }
        
        int i=10;
        while (i>0) {
            System.out.println("email "+i);
            i--;
        }
        
        do{
            System.out.println(i+".call");
            i++;
        }while(i<10);
        
        //koşullar if else
        i=5;
        if(i==10){
            System.out.println("You win! it is 10");
        } else if(i>10){
            System.out.println("it is big than 10");
        } else {
            System.out.println("it is small than 10");
        }
        
        //100 den 1 e kadar olan tek sayılar
        System.out.println("The odd numbers between 100-1");
        for (int tek=99; tek<1;tek-=2){
            System.out.println(tek);
        }
                
        
        //kullanıcıdan sayı alınıp bunu değerlendiren if else
        //scanner i kullanmak için import etmen gerek. nasıl import edilir?
        //herhangi bir yerde sağa tıklayıp "fix imports" dersen o kendini tamalıyor
        //ya da java.util.Scanner yazarsan import etmene gerek kalmaz ama her kullandığın yerde onu yazman gerekir
        System.out.println("Plese, Enter your test score (0-100):");
        Scanner s=new Scanner(System.in);
        int not=s.nextInt();    
        if(not>=90){
            System.out.println("you are PERFECT");
        } else if(not>=50 && not<90){
            System.out.println("GOOD");
        } else if(not>0 && not<50){
            System.out.println("YOU HAVE TO STUDY");
        } else {
            System.out.println("it is not a valid score!");
        }
           
      
               
    }
    
}
