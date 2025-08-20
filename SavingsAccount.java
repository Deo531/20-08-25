public class SavingsAccount {
    public String nama;
    public double saldo;
    public int jumlahpenarikan;
    public double saldoSetelahPenarikan;
    public double sukubunga;

    public void cetak(){
        System.out.println("Nama Customer : " + nama);
        System.out.println("Saldo : Rp " + saldo);
        System.out.println();
    }
    public void deposit(int x) {
        saldo += x;
        System.out.println("Deposit : Rp " + x);
        System.out.println("Saldo setelah deposit : Rp " + saldo);
        System.out.println();
    }
    public double calcInterest(){
        double bunga =  saldo * sukubunga / 12;
        if (bunga <= 0){
            System.out.println("Bunga : Tidak Valid");
        } else {
            System.out.println("Bunga : Per Bulan Rp " + bunga);
        } System.out.println();
        return bunga;
    }
    public void withdraw() {
        System.out.println("Anda Melakukan Penarikan");
        System.out.println("Jumlah Penarikan : Rp "+ jumlahpenarikan);
        if (jumlahpenarikan <= 0){
            System.out.println("Penarikan tidak boleh negatif");
        } else if (jumlahpenarikan >= 150000){
            System.out.println("Maaf Anda Mencapai Batas Nominal Maksimal Penarikan");
        }else if (saldo <= jumlahpenarikan) {
            System.out.println("Maaf Saldo anda tidak cukup");
            System.out.println("Saldo Anda Sekarang : Rp " + saldo);
        } else {
            saldoSetelahPenarikan = saldo - jumlahpenarikan;
            saldo = saldoSetelahPenarikan;
            System.out.println("Selamat anda berhasil melakukan penarikan yaitu Rp 200000");
            System.out.println("Saldo anda sekarang : Rp" + saldoSetelahPenarikan);
        } System.out.println("----------------------");
    }
}
