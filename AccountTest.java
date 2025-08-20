public class AccountTest {
    //Data Pengguna Bank
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.nama = "Ilham";
        account1.saldo = 190000.0;
        account1.jumlahpenarikan += 110000;
        account1.sukubunga = 0.2;
        account1.cetak();
        account1.deposit(55000);
        account1.calcInterest();
        account1.withdraw();
        
        SavingsAccount account2 = new SavingsAccount();
        account2.nama = "Fauzi";
        account2.saldo = 50000.0;
        account2.jumlahpenarikan += 100000;
        account2.sukubunga = 0.2;
        account2.cetak();
        account2.deposit(40000);
        account2.calcInterest();
        account2.withdraw();
        
    }
}