package pert5;
class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik
    double kapasitasBaterai; // dalam kWh

    // Constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        super.tampilInfo(); // tampilkan info traktor biasa
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " kWh");
        System.out.println("Kategori Mesin     : " + kategoriMesin());
        System.out.println("Nilai Performa     : " + nilaiPerforma());
    }

    @Override
    double nilaiPerforma() {
        // Performa traktor listrik biasanya lebih stabil,
        // contoh rumus:
        // (HP * 1.4) + (kapasitasTarik * 12) + (kapasitasBaterai * 0.5)

        return (tenagaHP * 1.4) + (kapasitasTarik * 12) + (kapasitasBaterai * 0.5);
    }

    @Override
    String kategoriMesin() {
        if (kapasitasBaterai >= 150) return "Traktor Listrik Heavy Duty";
        else if (kapasitasBaterai >= 100) return "Traktor Listrik Medium";
        else return "Traktor Listrik Light";
    }

    @Override
    void suaraMesin() {
        System.out.println("Hummmm... (Mesin listrik halus tanpa suara bising)");
    }
}
