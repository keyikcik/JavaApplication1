/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//kullanıcıdan sayı alınıp bunu değerlendiren if else
//scanner i kullanmak için import etmen gerek. nasıl import edilir?
//herhangi bir yerde sağa tıklayıp "fix imports" dersen o kendini tamalıyor
//ya da java.util.Scanner yazarsan import etmene gerek kalmaz ama her kullandığın yerde onu yazman gerekir

package javaapplication1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author kyk
 */
public class Java2 { 
        public static void main(String[] args) {
        System.out.println("Please, Enter Your Score:");
        Scanner a=new Scanner(System.in);
        int sayi=a.nextInt();
        if (sayi>=90){
            System.out.println("Your note is: AA");
            
        }
        else if (sayi>=80){
            System.out.println("Your note is: BB");
        }
        else if (sayi>=70) {
            System.out.println("Your note is: CC");
        }
        else {
            System.out.println("Your note is : F");
        }
        
    }
    
}
