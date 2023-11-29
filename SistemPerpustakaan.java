/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistemperpustakaan;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SistemPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        Buku Pulang = new Buku("Pulang", "Tere Liye", "505467");
        Buku LautBercerita = new Buku("LautBercerita", "Leila Salikha Chudori", "890123");
        Buku HelloCello = new Buku("HelloCello", "Nadia Ristivani", "890678");

        Anggota_Perpus anggota1 = new Anggota_Perpus("Adilla Aulia Desriyanti", "A01", "Antasari ");

        int choice;
        do {
            System.out.println("== Selamat datang di SimPus ==");
            System.out.println("Menu :");
            System.out.println("1. Anggota Perpustakaan");
            System.out.println("2. Admin");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    memberMenu(anggota1, Pulang, LautBercerita , HelloCello, scanner);
                    break;
                case 2:
                    adminMenu(Pulang, scanner);
                    break;
                case 0:
                    System.out.println("== Terima kasih telah menggunakan layanan perpustakaan. ==");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void memberMenu(Anggota_Perpus anggota, Buku buku1, Buku buku2, Buku buku3, Scanner scanner) {
        int memberChoice;
        do {
            System.out.println("\nMenu Anggota Perpustakaan");
            System.out.println("1. Meminjam Buku");
            System.out.println("2. Mengembalikan Buku");
            System.out.println("0. Kembali ke Menu Utama");

            System.out.print("Pilihan Anda : ");
            memberChoice = scanner.nextInt();

            switch (memberChoice) {
                case 1:
                    System.out.println("Buku yang Tersedia :");
                    System.out.println("1. " + buku1.getJudul());
                    System.out.println("2. " + buku2.getJudul());
                    System.out.println("3. " + buku3.getJudul());
                    
                    System.out.print("Pilih nomor buku yang ingin Anda pinjam : ");
                    int bookChoice = scanner.nextInt();

                    switch (bookChoice) {
                        case 1:
                            anggota.pinjamBuku(buku1, buku1.getJudul(), new Date(), 7);
                            break;
                        case 2:
                            anggota.pinjamBuku(buku2, buku2.getJudul(), new Date(), 7);
                            break;
                        case 3:
                            anggota.pinjamBuku(buku3, buku3.getJudul(), new Date(), 7);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi ");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan judul buku yang ingin Anda kembalikan : ");
                    scanner.nextLine(); 
                    String judulKembali = scanner.nextLine();
                    anggota.kembalikanBuku(buku1, judulKembali, new Date());
                    break;
                case 0:
                    System.out.println("Kembali ke Menu Utama ");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (memberChoice != 0);
    }

    private static void adminMenu(Buku buku, Scanner scanner) {
        int adminChoice;
        do {
            System.out.println("\nMenu Admin");
            System.out.println("1. Menambah Koleksi Buku");
            System.out.println("0. Kembali ke Menu Utama");

            System.out.print("Pilihan Anda : ");
            adminChoice = scanner.nextInt();

            switch (adminChoice) {
                case 1:
                    Buku newBook = createBook(scanner);
                    newBook.tambahKeKoleksi();
                    break;
                case 0:
                    System.out.println("Kembali ke Menu Utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi ");
            }
        } while (adminChoice != 0);
    }

    private static Buku createBook(Scanner scanner) {
        System.out.print("Masukkan judul buku : ");
        scanner.nextLine();
        String bookTitle = scanner.nextLine();

        System.out.print("Masukkan penulis buku : ");
        String bookAuthor = scanner.nextLine();

        System.out.print("Masukkan ISBN buku : ");
        String bookISBN = scanner.nextLine();

        return new Buku(bookTitle, bookAuthor, bookISBN);
    }
    
}
