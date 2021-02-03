/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelimetahminoyunu;

import java.io.*;

/**
 *
 * @author Asus
 */
public class KelimeTahminOyunu {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException{
        // TODO code application logic here
        String kelime = "Muhammet";
        int tahmin=0;
        int anahtar=0;
        int dogru=0;
        String eldevar[]= new String[kelime.length()];
        BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < kelime.length(); i++) {
            eldevar[i]="-";
            
        }
        finish:
        while (tahmin<5) {
            System.out.println("Bir Harf Giriniz.(Kalan Hakkınız:"+(4-tahmin)+"):");
            String harf = klavye.readLine();
            tahmin++;
            for (int i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i)== harf.charAt(0)) {
                    eldevar[i]=harf+"";
                    anahtar =1;
                    dogru++;
                    if (dogru==kelime.length()) {
                        System.out.println("Kelime"+kelime+"...Tebrikler...");
                        break finish;
                    }
                }
                
                
            }
            if (anahtar == 1) {
                anahtar=0;
                tahmin--;
                for (int i = 0; i < kelime.length(); i++) {
                    System.out.print(eldevar[i]);
                     }
                }
                System.out.println();
                
            }
            if (dogru != kelime.length()) {
                System.out.println("Uzgunum...Dogru yanit"+kelime);
                
            }
        }
        
        
        
   
    
}
