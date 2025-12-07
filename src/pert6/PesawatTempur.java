package pert6;

public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================
    private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 3; // 3% per km
        int energiSekarang = getLevelEnergi();

        if (energiSekarang < konsumsi) {
            System.out.println("Energi tidak cukup untuk menjelajah sejauh " + jarak + " km!");
        } else {
            setLevelEnergi(energiSekarang - konsumsi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiBaru = getLevelEnergi() + jumlah;
        if (energiBaru > 100) energiBaru = 100;

        setLevelEnergi(energiBaru);
        System.out.println("Mengisi energi... Energi sekarang: " + getLevelEnergi() + "%");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================
    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal! Rudal tidak mencukupi. Sisa: " + jumlahRudal);
        }
    }
}
