/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Aldy Senda
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private final String red = "\u001B[31m";
    Scanner input = new Scanner(System.in);
    
    public Age (int yearNow){
        
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    public int hitungUmur (){
        int umur = yearNow - yearBirth;
        return umur;
    }
    public String tandanyaKamu(int umur){
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        yearBirth = input.nextInt();
        System.out.print("Hari Ini Tahun : ");
        yearNow = input.nextInt();
        System.out.println("Umur Kamu Sampai Hari Ini Adalah " + hitungUmur() 
                + " tahun");
        
        if ((hitungUmur() >= 0) && (hitungUmur() <=5)){
            System.out.println("Tandanya Kamu " + red + "Lagi Lucu-Lucunya");
        }
        else if ((hitungUmur() > 5) && (hitungUmur() <= 10)){
             System.out.print("Tandanya Kamu " + red + 
                     "Masih Anak-Anak");
        }
        else if ((hitungUmur() > 10) && (hitungUmur() <= 13)){
             System.out.print("Tandanya Kamu " + red + "Masih Remadja");
        }
        else if ((hitungUmur() > 13) && (hitungUmur() <= 19)){
             System.out.print("Tandanya Kamu " + red + "Alay");
        }
        else if ((hitungUmur() > 19) && (hitungUmur() <= 29)){
             System.out.print("Tandanya Kamu " + red + 
                     "Lagi Galau Nyari Jodoh");
        }
        else if ((hitungUmur() > 29) && (hitungUmur() <= 35)){
             System.out.print("Tandanya Kamu " + red + 
                     "Lagi Sibuk Nyari Uang");
        }
        else if ((hitungUmur() > 35) && (hitungUmur() <= 150)){
             System.out.print("Tandanya Kamu " + red + "Sudah Tua");
        }
        else {
            System.out.println("Tandanya Kamu " + red + 
                    "Tidak Terdeteksi Di Kehidupan");
        }
        return null;
    }
    
}
