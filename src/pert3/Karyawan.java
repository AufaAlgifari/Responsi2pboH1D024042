package pert3;
class Karyawan {
    // Deklarasikan variabel/state dasar
    protected String nama;
    protected double gajiPokok;

    // Constructor untuk inisialisasi
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
    }
}