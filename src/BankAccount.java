public class BankAccount {
    private long acc_no;
    private String name, email;
    private double amount;

    long getAcc_no() {
        return acc_no;
    }
    void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }
    void setEmail(String email) {
        this.email = email;
    }

    double getAmount() {
        return amount;
    }
    void setAmount(double amount) {
        this.amount = amount;
    }
}
class Run{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAcc_no(1234567890);
        ba.setName("Gawesh Prabhashwara");
        ba.setEmail("gawesh2020java@gmail.com");
        ba.setAmount(24567.987);

        System.out.println(ba.getAcc_no()+ " " +ba.getName()+" " +ba.getEmail()+" " + ba.getAmount()+" ");
    }
}
