public class Account {
    private long acc;
    public long getAcc() {
        return acc;
    }
    public void setAcc(int acc) {
        this.acc = acc;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class TestRun {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAcc(123456789);
        a.setName("Amal");

        System.out.println("Account No: "+a.getAcc());
        System.out.println("Owner: "+a.getName());
    }
}