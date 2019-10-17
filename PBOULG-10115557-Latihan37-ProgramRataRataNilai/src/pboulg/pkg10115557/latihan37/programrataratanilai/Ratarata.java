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
class Ratarata {
    public double rata2;
    public double jmlhNilai = 0;
    
    public void hitungNilai(int jmlhMahasiswa) {
        int i;
        double nilai;
        Scanner scn = new Scanner(System.in);
        
        for(i = 1; i <= jmlhMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scn.nextDouble();
            jmlhNilai = jmlhNilai + nilai;
        }
    }
    
    public double hitungRata2Nilai(double jmlhNilai, int jmlhMahasiswa) {
        rata2 = jmlhNilai / jmlhMahasiswa;
        return rata2;
    }
}
