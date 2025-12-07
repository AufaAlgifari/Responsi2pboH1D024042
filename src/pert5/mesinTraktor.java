package pert5;
class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor
    double kapasitasTarik; // dalam ton

    // Constructor
    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        super.tampilInfo(); // tampilkan info dasar
        System.out.println("Kapasitas Tarik : " + kapasitasTarik + " ton");
        System.out.println("Kategori Mesin   : " + kategoriMesin());
        System.out.println("Nilai Performa   : " + nilaiPerforma());
    }

    @Override
    double nilaiPerforma() {
        // Rumus sederhana:
        // Performa = HP * 1.2 + kapasitasTarik * 10
        // Semakin kuat tarikannya, performa semakin besar
        return (tenagaHP * 1.2) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        if (kapasitasTarik >= 10) return "Traktor Berat";
        else if (kapasitasTarik >= 5) return "Traktor Menengah";
        else return "Traktor Ringan";
    }

    void suaraMesin() {
        System.out.println("GROOOOONGGGG... Mesin traktor bekerja kuat!");
    }
}
