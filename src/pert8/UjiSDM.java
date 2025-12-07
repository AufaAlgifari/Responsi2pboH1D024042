package pert8;

public class UjiSDM {
    public static void main(String[] args) {

        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");

        // 1. Buat objek
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. Pengujian
        andi.hitungGaji(160);

        System.out.println("Status Cuti: " + andi.getStatusCuti());

        andi.login("9999");   // salah
        andi.login("1234");   // benar

        System.out.println("Role Akses: " + andi.getRoleAkses());

        andi.perpanjangKontrak(6);

        andi.logout();
    }
}
