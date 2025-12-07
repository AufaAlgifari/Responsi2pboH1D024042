package pert8;

public interface AksesSistem {

    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN)
    // ==========================================================

    void login(String pin);

    void logout();

    // ==========================================================
    // DEFAULT METHOD (OPSIONAL)
    // ==========================================================

    default String getRoleAkses() {
        return "Staff Biasa";
    }

}
