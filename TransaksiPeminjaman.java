/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemperpustakaan;

import java.util.Date;

public class TransaksiPeminjaman {
    private String id;
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;
    private String waktu;
    private int durasiPeminjaman;
    private Anggota_Perpus anggota;
    private Buku buku;

    public TransaksiPeminjaman(String id, Date tanggalPeminjaman, Date tanggalPengembalian,
                               String waktu, int durasiPeminjaman, Anggota_Perpus anggota, Buku buku) {
        this.id = id;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktu = waktu;
        this.durasiPeminjaman = durasiPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void catatPeminjaman() {
        if (tanggalPeminjaman != null) {
            System.out.println("Peminjaman buku " + buku.getJudul() + " oleh " + anggota.getNamaAnggota()
                    + " pada tanggal " + tanggalPeminjaman + " (" + waktu + ").");
        } else {
            System.out.println("Transaksi peminjaman belum tercatat ");
        }
    }

    public void catatPengembalian() {
        if (tanggalPengembalian != null) {
            System.out.println("Pengembalian buku " + buku.getJudul() + " oleh " + anggota.getNamaAnggota()
                    + " pada tanggal " + tanggalPengembalian + ".");
        } else {
            System.out.println("Transaksi pengembalian belum tercatat ");
        }
    }
}
