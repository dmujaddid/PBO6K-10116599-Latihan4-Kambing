/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan4.kambing;

/**
 *
 * @author
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program pengaksesan variabel lokal 
 * 
 */
public class Kambing {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
