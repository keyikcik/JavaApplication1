/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// döngülerle yazılabilen denklenmeler recursive yani özyinemeli fonksiyon olarak da yazılabilir. 
// ama recursive kodlar her defasında kendini yinelediği için yazılımcı için kolaydır ama compire edilen program yavaştır
package javaapplication1;

/**
 *
 * @author kyk
 */
public class recursive {
    public static int f(int r){
        if (r==10) return 10;
        System.out.println("r:"+r);
        return r+f(r+1);
        
        //f(0):0+F(1)
        //f(1):1+F(2)
        //f(2):2+F(3)
        //...
        //f(9):9+F(10) =>   9+10
        //f(10):10
    }
    
    public static int fib(int n){   // Fibonocci için recursive yapmak için 2.örnek
            if(n==0) return 1;      // fibonocci 1 1 2 3 5 8 diye gidiyor yani ilk 2 değer önemli
            if(n==1) return 1;      // n. değeri istese de kendini yenileyen fonsiyon olduğu için n.değeri bulur
            return fib(n-1)+fib(n-2); //fibonoccide son iki sayıyı topladığımız için
        }
    
    public static void main(String[] args){
        System.out.println("f(0):"+f(0));
        // hiç fonksiyon eklemeden yukardaki işelmi döngü ile yapım:
        int sum=0;
        for(int i=0; i<10; i++){
            sum +=i+1;
            System.out.println("toplam:"+sum+"i:"+i);
        }
        System.out.println("sonuç:"+sum);       
       
        
        System.out.println("Fibonocci in Recursive "); //2.örnek
        
        System.out.println(fib(10));
    }
    
    
}
