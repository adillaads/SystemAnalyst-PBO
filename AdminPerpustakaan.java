/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemperpustakaan;

public class AdminPerpustakaan {
    public String idAdmin;
    public String namaAdmin;
    public String alamatAdmin;
    public String nomorTelepon;
    
    public void login() {
        System.out.println("Admin " + namaAdmin + " telah berhasil login.");
        System.out.println("-----------------------------");
    }

    public void logout() {
        System.out.println("Admin " + namaAdmin + " telah berhasil logout.");
        System.out.println("-----------------------------");
}
}