package pert6;

public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    private String namaKendaraan;
    private int levelEnergi;            // 0–100
    private int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // Constructor:
    // - namaKendaraan
    // - kapasitasPenumpang
    // levelEnergi default = 100
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }


    // ==========================================================
    // GETTER
    // ==========================================================

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }


    // Setter energi (opsional untuk subclass)
    protected void setLevelEnergi(int level) {
        if (level < 0) level = 0;
        if (level > 100) level = 100;
        this.levelEnergi = level;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // Method final → tidak bisa di-override oleh subclass
    public final void tampilStatus() {
        System.out.println(
                "[" + namaKendaraan + "] | Energi: " + levelEnergi +
                        "% | Kapasitas: " + kapasitasPenumpang + " awak"
        );
    }


    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    public abstract void aktifkanMesin();

    public abstract void jelajah(int jarak);

    public abstract void isiEnergi(int jumlah);
}

