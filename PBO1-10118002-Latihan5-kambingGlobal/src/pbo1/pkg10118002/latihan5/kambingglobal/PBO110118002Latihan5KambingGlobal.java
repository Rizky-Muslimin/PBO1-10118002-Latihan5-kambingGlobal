/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118002.latihan5.kambingglobal;

/**
 *
 * @author ASUS
 * Nama     : Rizky Muslimin
 * Kelas    : IF1
 * NIM      : 10118002
 */
public class PBO110118002Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    int jumlahKambing = 88;
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    PBO110118002Latihan5KambingGlobal kambingSusu = new PBO110118002Latihan5KambingGlobal();
    //menampilkan jumlah kambing yang ada saat program pertama x berjalan 
    kambingSusu.getJumlahKambing();
    
    //menambah satu kambing
    kambingSusu.tambahKambing();
    
    //menampilkan jumlah kem}bing yang ada
    kambingSusu.getJumlahKambing();
    }
    
}
