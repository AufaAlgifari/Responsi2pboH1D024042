package pert3;

public class Manager extends Karyawan{
    // Variabel tambahan khusus Manager
    private double tunjangan;

    // Constructor
    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok); // memanggil constructor Karyawan
        this.tunjangan = tunjangan;
    }

    // Method Override tampilInfo
    @Override
    void tampilInfo() {
        super.tampilInfo(); // tampilkan info dasar
        System.out.println("Tunjangan     : Rp " + tunjangan);
        System.out.println("Total Gaji    : Rp " + (gajiPokok + tunjangan));
    }
}
