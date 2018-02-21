/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader; //burda tek tek import etmek yerine-import java.io.*- yani * kullanırsan
import java.io.File;           // hepsini import eder 
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author kyk
 */
public class fileAPI {
    public static void main(String[] args){
        File f = new File("name.txt");
        try{
            FileReader fr = new FileReader(f);  
            int c = fr.read();  // read() okuyor ve sayfanın sonuna geldiğinde -1 değeri döndürüyr
            while(c!=-1){            // -1 görünceye kadar okumaya devam etmesi için
                System.out.print(c); // print aynı satıra println altalta yazılyor
                //System.out.println(" ");
                System.out.print((char)c+" ");
                c=fr.read();         // bu arada okuma işi int değerinden yani karekterin ascı kodundn
            }
            fr.close(); // açtığın belgeri kapatman gerekiyor. altta ikinci yolu gösterirken tekrar açıyor:
            f = new File("name.txt");
            BufferedReader br = new BufferedReader(new FileReader(f)); //başka bir yöntemle okutuyorsun
            System.out.println(" ");
            System.out.println(br.readLine()); //readLine satırı okuyor 
            br.close();             // 2.Kere açtığın belgeyi de kapatıyorsun
            
            File cikti = new File("name2.txt"); // bir belge oluşturmak içine yazı yazmak
            FileWriter fw = new FileWriter(cikti);
            fw.write("Bu bir deneme mesaj, Welcome :))"); // name2.txt ddosyasına bu msjı yazmış oalcak
            fw.close();
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
