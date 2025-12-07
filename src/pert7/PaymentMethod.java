package pert7;

public interface PaymentMethod {

    // Memproses pembayaran
    String processPayment();

    // Mengembalikan detail informasi pembayaran
    String getPaymentDetails();

    // Mengembalikan biaya transaksi
    double getTransactionFee();

    // Mengembalikan saldo pengguna
    double getBalance();
}

