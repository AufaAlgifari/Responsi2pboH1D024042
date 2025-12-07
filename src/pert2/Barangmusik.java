package pert2;

public class Barangmusik {
    // Deklarasikan variabel/state
    String kode;
    String nama;
    double harga;
    int stok;

    // Constructor pertama: hanya kode & nama
    public Barangmusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Constructor kedua: kode, nama, harga
    public Barangmusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor ketiga: data lengkap
    public Barangmusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method ubah harga
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Method tambah stok
    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    // Method tampil info
    void tampilInfo() {
        System.out.println("Alat musik " + nama +
                " | Kode: " + kode +
                " | Harga: Rp " + harga +
                " | Stok: " + stok + " unit");
    }
}
