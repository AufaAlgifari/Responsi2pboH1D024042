package pert7;

public class EWalletPayment implements PaymentMethod {

    private String namaLayanan;
    private double saldo;
    private double nominalTransaksi;

    // Biaya transaksi (tetap)
    private final double transactionFee = 2000;

    // Constructor
    public EWalletPayment(String namaLayanan, double saldo, double nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    @Override
    public String processPayment() {
        double totalPembayaran = nominalTransaksi + transactionFee;

        System.out.println("Memproses pembayaran sebesar " + nominalTransaksi + "...");

        if (saldo >= totalPembayaran) {
            saldo -= totalPembayaran;
            System.out.println("Pembayaran berhasil!");
            return "Pembayaran berhasil!";
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return transactionFee;
    }

    @Override
    public double getBalance() {
        return saldo;
    }

    // Tambahan: method untuk menampilkan info lengkap (supaya output rapi)
    public void displayPaymentInfo() {
        System.out.println("Saldo saat ini: " + saldo);
        System.out.println("Nominal pembayaran: " + nominalTransaksi);
        System.out.println("Biaya transaksi: " + transactionFee);
        System.out.println("Detail transaksi: " + getPaymentDetails());
    }
}

