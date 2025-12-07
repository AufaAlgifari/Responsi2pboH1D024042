package pert5;
class analisisMesin {
    public static void main(String[] args) {
        // =============== 1. Buat array mesin ===============
        defaultMesin[] data = new defaultMesin[5];

        data[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        data[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        data[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        data[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        data[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        // =============== 2. Tampilkan data mesin ===============
        System.out.println("=== DATA MESIN MEGATECH ===\n");

        for (defaultMesin m : data) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        // =============== 3. Suara mesin (polimorfisme + instanceof) ===============
        System.out.println("=== SUARA MESIN ===");

        for (defaultMesin m : data) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        // =============== 4. Cari performa tertinggi ===============
        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        defaultMesin terbaik = data[0];

        for (defaultMesin m : data) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }

        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        // =============== 5. Sorting Top 3 mesin terbaik ===============
        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Bubble Sort sederhana (descending)
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j].nilaiPerforma() < data[j + 1].nilaiPerforma()) {
                    defaultMesin temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + data[i].namaMesin + " → " + data[i].nilaiPerforma());
        }
    }
}
