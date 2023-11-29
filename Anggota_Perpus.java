/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemperpustakaan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Anggota_Perpus {
    private String namaAnggota;
    private String nomorAnggota;
    private String alamatAnggota;
    private List<TransaksiPeminjaman> riwayat;

    public Anggota_Perpus(String namaAnggota, String nomorAnggota, String alamatAnggota) {
        this.namaAnggota = namaAnggota;
        this.nomorAnggota = nomorAnggota;
        this.alamatAnggota = alamatAnggota;
        this.riwayat = new ArrayList<>();
       
        
        Buku bukuSample = new Buku("Harry Potter", "J.K. Rowling", "0420988");
        TransaksiPeminjaman sampleTransaction = new TransaksiPeminjaman(
                "T1", new Date(), null, "17:00", 7, this, bukuSample);
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void pinjamBuku(Buku buku, String judul, Date tanggalPinjam, int durasiPinjam) {
        for (TransaksiPeminjaman transaksi : riwayat) {
            if (transaksi.getBuku().getJudul().equals(judul) && transaksi.getTanggalPengembalian() == null) {
                System.out.println("Maaf, buku " + judul + " sudah dipinjam.");
                return;
            }
        }

        if (buku.cekKetersediaan()) {
            TransaksiPeminjaman transaksi = new TransaksiPeminjaman(
                    "T" + (riwayat.size() + 1),
                    new Date(),
                    null,
                    "17:00",
                    durasiPinjam,
                    this,
                    buku
            );
            riwayat.add(transaksi);
            buku.setKetersediaan(false);
            System.out.println("Anda berhasil meminjam buku \"" + judul + "\".");
            System.out.println("Buku harus dikembalikan dalam " + durasiPinjam + " hari.");
        } else {
            System.out.println("Maaf, buku " + judul + " tidak tersedia.");
        }
    }

    public void kembalikanBuku(Buku buku, String judul, Date tanggalKembali) {
    for (TransaksiPeminjaman transaksi : riwayat) {
        if (transaksi.getBuku().getJudul().equalsIgnoreCase(judul) && transaksi.getTanggalPengembalian() == null) {
            transaksi.setTanggalPengembalian(tanggalKembali);
            buku.setKetersediaan(true);
            System.out.println("Anggota " + namaAnggota + " telah mengembalikan buku " + judul);
            System.out.println("-----------------------------");
            return;
        }
    }
    System.out.println("Peminjaman buku " + judul + " tidak ditemukan.");
    System.out.println("-----------------------------");
}

}
