package banking;

public class Account {

    private static String cardNumber;
    private static String pin;
    private static int balance;

    public Account() {
        cardNumber = "400000" + String.format("%09d",
                (long) (Math.random() * 999999999L)) + "0";
        pin = String.format("%04d", (long) (Math.random() * 9999));
        balance = 0;
    }

    public  String getCardNumber() {
        return cardNumber;
    }

    public  void setCardNumber(String cardNumber) {
        Account.cardNumber = cardNumber;
    }

    public  String getPin() {
        return pin;
    }

    public  void setPin(String pin) {
        Account.pin = pin;
    }

    public  int getBalance() {
        return balance;
    }

    public  void setBalance(int balance) {
        Account.balance = balance;
    }



}
