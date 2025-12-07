package pert3;
class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Buat objek Karyawan biasa (Budi)
        Karyawan budi = new Karyawan("Budi", 3000000);

        // Tampilkan info Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        budi.tampilInfo();

        System.out.println(); // Baris baru/jarak

        // Buat objek Manajer (Siti)
        Manager siti = new Manager("Siti", 5000000, 2000000);

        // Tampilkan info Manajer
        System.out.println("Status: Manajer");
        siti.tampilInfo();
    }
}