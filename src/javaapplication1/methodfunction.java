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
public class methodfunction {
    static int f(int x){
        return 5*x+10;
    }
    static int g(int x, int y){ //sonuç olarak neyi return edeceksen onun tipini öncesinde yazman gerekiyor mesela int,string,float...
        return y+2*x;
    }
    static void yaz(){ //bazı fonsiyonlarınn parametresi olmayabilir de. void değince geri bişey de döndürmüyor
        System.out.println("Hello World !");
    }
public static void main(String[] args){
    System.out.println(f(10));
    System.out.println(g(3,5));
    System.out.println(f(g(5,5)));
    yaz();
    
} 
    
}
