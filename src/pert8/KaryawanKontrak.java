package pert8;

public interface KaryawanKontrak {

    // ==========================================================
    // METHOD ABSTRAK (WAJIB)
    // ==========================================================
    // Method wajib
    double hitungGaji(int jamKerja);
    void perpanjangKontrak(int durasiBulan);

    // Default method opsional
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }

    // Method login menggunakan PIN
    void login(String pin);

    // Method logout
    void logout();


    // ==========================================================
    // DEFAULT METHOD (OPSIONAL)
    // ==========================================================

    default String getRoleAkses() {
        return "Staff Biasa";
    }

}
