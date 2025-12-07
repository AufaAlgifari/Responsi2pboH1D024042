package pert7;

public class PaymentTest {

    public static void main(String[] args) {


        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // Data sesuai contoh soal
        EWalletPayment payment = new EWalletPayment("OVO", 150000, 50000);

        // Saldo awal
        System.out.println("Saldo awal: " + payment.getBalance());

        // Memproses pembayaran
        payment.processPayment();

        // Sisa saldo
        System.out.println("Sisa saldo: " + payment.getBalance());

        // Detail transaksi
        System.out.println("Detail Transaksi: " + payment.getPaymentDetails());
    }

}

