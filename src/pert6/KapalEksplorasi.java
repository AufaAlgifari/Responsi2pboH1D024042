package pert6;

public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================
    private int modulScan;   // kemampuan scan planet (level 1–5)


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 2; // 2% per km
        int energiSekarang = getLevelEnergi();

        if (energiSekarang < konsumsi) {
            System.out.println("Energi tidak cukup untuk menjelajah sejauh " + jarak + " km!");
        } else {
            setLevelEnergi(energiSekarang - konsumsi);
            System.out.println("Menjelajah sejauh " + jarak + " km. Energi tersisa: "
                    + getLevelEnergi() + "%");
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
    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet +
                " dengan modul level " + modulScan + ".");
    }
}

