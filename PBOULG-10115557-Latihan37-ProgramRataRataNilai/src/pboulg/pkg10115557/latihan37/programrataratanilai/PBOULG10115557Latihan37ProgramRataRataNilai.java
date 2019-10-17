/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Rata-rata Nilai berbasis object
 */
public class PBOULG10115557Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int jmlhMahasiswa;
        Scanner scn = new Scanner(System.in);
        Ratarata rt = new Ratarata();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jmlhMahasiswa = scn.nextInt();
        
        rt.hitungNilai(jmlhMahasiswa);
        System.out.println("Rata-rata nilai : "
                + rt.hitungRata2Nilai(rt.jmlhNilai, jmlhMahasiswa));
    }
    
}
