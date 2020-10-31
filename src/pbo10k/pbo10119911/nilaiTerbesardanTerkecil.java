/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.util.Scanner;

/**
 *
 * @author tegar
 */
public class nilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama_petugas;
        int maksimum, minimum, jumlah_mhs,  i, array[];
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("=======Program Nilai Terbesar dan Terkecil Mahasiswa======");
        System.out.print("Masukkan Nama Petugas : ");
        nama_petugas = scan.next();
        System.out.print("Masukkan Banyak Nilai Mahasiswa : ");
        jumlah_mhs = scan.nextInt();
        array = new int[jumlah_mhs];
        
            for (i=0; i < jumlah_mhs; i++ ){
                System.out.print("Masukkan Nilai Mahasiswa ke- " + (i+1) + "=");
                array[i] = scan.nextInt();
            }
            maksimum = array[0];
            minimum = array[0];
            
                for (i = 0; i < jumlah_mhs; i++){
                    if(array[i] > maksimum){
                        maksimum = array[i];
                        
                    }
                    else if(array[i] < minimum){
                        minimum = array[i];
                        
                    }
                }
                
                    System.out.println();
                    System.out.println("=====Hasil Nilai Mahasiswa=====");
                       
                    for(i=0; i < jumlah_mhs; i++){
                        System.out.println("Nilai Mahasiswa ke- " + (i+1) + " " +array[i]);
                    }
                    System.out.println();
                    System.out.println("Nilai Terbesar Adalah " + maksimum);
                    System.out.println("Nilai terkecil Adalah " + minimum );
                    
                    System.out.println("Petugas : " +nama_petugas);
        
    }
    
}
