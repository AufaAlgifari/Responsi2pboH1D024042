package pert5;
class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor
    String tipeMotor;

    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);        // memanggil constructor parent
        this.tipeMotor = tipe;  // set data khusus mesin motor
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();  // tampilkan info dasar dari defaultMesin
        System.out.println("Tipe Motor     : " + tipeMotor);
        System.out.println("Kategori Mesin : " + kategoriMesin());
        System.out.println("Nilai Performa : " + nilaiPerforma());
    }

    @Override
    double nilaiPerforma() {
        // Contoh rumus performa motor
        // Semakin besar hp dan semakin sport, performanya meningkat
        if (tipeMotor.equalsIgnoreCase("Sport")) {
            return tenagaHP * 1.8;
        } else if (tipeMotor.equalsIgnoreCase("Matic")) {
            return tenagaHP * 1.3;
        } else {
            return tenagaHP * 1.1; // bebek atau lainnya
        }
    }

    @Override
    String kategoriMesin() {
        if (tenagaHP >= 150) return "Kuat";
        else if (tenagaHP >= 100) return "Sedang";
        else return "Ringan";
    }

    void suaraMesin() {
        System.out.println("Brummm brummm!!! Suara khas motor " + tipeMotor);
    }
}
