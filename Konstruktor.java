/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YOGA
 */
public class Konstruktor {

    int harga, jumlahBarang, bayar, kembalian;

    void Konstruktor(int harga, int jumlahBarang, int bayar) {
        this.harga = harga;
        this.jumlahBarang = jumlahBarang;
        this.bayar = bayar;
    }

    void hitung() {
        kembalian = bayar - (harga * jumlahBarang);
        System.out.println(" kembalian anda sebesar = " + kembalian);
    }
}
