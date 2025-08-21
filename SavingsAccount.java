public class SavingsAccount {
    public String nama;
    public double saldo;
    public int jumlahpenarikan;
    public double saldoSetelahPenarikan;
    public double sukubunga;
    
    //Informasi Akun
    public void cetak(){
        System.out.println("Nama Customer           : " + nama);
        System.out.println("Saldo                   : Rp " + saldo);
        System.out.println("Suku Bunga              : " + (sukubunga * 100) + "%");
        System.out.println();
    }

    //Menambahkan Dana ke saldo
    public void deposit(int x) {
        saldo += x;
        System.out.println("Deposit                 : Rp " + x);
        System.out.println("Saldo setelah deposit   : Rp " + saldo);
        System.out.println();
    }
    //Menghitung bunga bulanan
    public double calcInterest(){
        double bunga =  saldo * sukubunga / 12;
        System.out.println("Total Bunga perbulan    : Rp " + bunga);
        System.out.println();
        return bunga;
    }

    //Menarik uang dari saldo
    public void withdraw() {
        System.out.println("Anda Melakukan Penarikan");
        System.out.println("Jumlah Penarikan        : Rp "+ jumlahpenarikan);
        
        if (jumlahpenarikan <= 0){
            System.out.println("Penarikan tidak boleh negatif");
        } else if (jumlahpenarikan >= 150000){
            System.out.println("Maaf Anda Mencapai Batas Nominal Maksimal Penarikan yaitu Rp 150.000");
        }else if (saldo <= jumlahpenarikan) {
            System.out.println("Maaf Saldo anda tidak cukup");
            System.out.println("Saldo Anda Sekarang     : Rp " + saldo);
        } else {
            saldoSetelahPenarikan = saldo - jumlahpenarikan;
            saldo = saldoSetelahPenarikan;
            System.out.println("Selamat anda berhasil melakukan penarikan");
            System.out.println("Saldo anda sekarang     : Rp" + saldoSetelahPenarikan);
        } System.out.println("---------------------------------");
        System.out.println();
    }
}
