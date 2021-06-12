package extratasks;
//  Quyidagi attributelardan iborat Account klassini encapsulation prinsipi asosida yarating:
//        (int) cardNumber - karta nomeri,
//        (string) cardHolder - karta egasi,
//        (String) cardCompany - qaysi bankniki,
//        (int) balance - balansi,
//        (String) password - kartani paroli,
//        (boolean) status - karta xolati (password 3 martadan oshiq xato terilsa bloklansin)
//

public class Mainof {
    private int id;
    private  String cardHolder;
    private String cardCompany;
    private double balance;
    private String password;
    private boolean status;




    public  Mainof() {
    }

    public Mainof(int id, String cardHolder, String cardCompany,
                 double balance, String password, boolean status) {

        this.id = id;
        this.cardHolder = cardHolder;
        this.cardCompany = cardCompany;
        this.balance = balance;
        this.password = password;
        this.status = status;

    }


    public int getCardNumber() {
        return id;
    }

    public void setCardNumber(int id) {
        this.id = id;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardCompany() {
        return cardCompany;
    }

    public void setCardCompany(String cardCompany) {
        this.cardCompany = cardCompany;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public Object setPassword(String password) {
        this.password = password;
        return null;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Main{" +
                "id=" + id +
                ", cardHolder='" + cardHolder + '\'' +
                ", cardCompany='" + cardCompany + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

    public void setPassword(boolean b) {
    }

    public boolean setBalance(boolean b) {
        return b;
    }
}
