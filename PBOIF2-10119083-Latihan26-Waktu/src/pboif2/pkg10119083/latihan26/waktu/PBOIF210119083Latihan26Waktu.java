/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *  @author
 * Nama : Rafsan Zen Mustaofa
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Menamplkan waktu
 */
public class PBOIF210119083Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Date tanggal = new Date();

        SimpleDateFormat format = new SimpleDateFormat("E dd MMMM yyyy HH:mm:ss");
        System.out.println("Hari ini adalah hari : " + format.format(tanggal));
        
        System.out.println("==============================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
