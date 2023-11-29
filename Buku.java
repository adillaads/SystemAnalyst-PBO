/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemperpustakaan;

public class Buku {
    public String judul;
    public String pengarang;
    public String noISBN;
    public boolean Ketersediaan;

    public Buku(String judul, String pengarang, String noISBN) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.noISBN = noISBN;
        this.Ketersediaan = true;
    }

    public void tambahKeKoleksi() {
        System.out.println("Buku " + judul + " ditambahkan ke koleksi.");
        System.out.println("-----------------------------");
    }

    public boolean cekKetersediaan() {
        return Ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.Ketersediaan = ketersediaan;
    }

    public String getJudul() {
        return judul;
}
}