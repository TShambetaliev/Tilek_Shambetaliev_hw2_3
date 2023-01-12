public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        System.out.println(bankAccount.getAmount());

        while (true)
        {
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                try {
                    bankAccount.withDraw(le.getRemainingAmount());
                    System.out.println("OSTATOK " + bankAccount.getAmount());
                } catch (LimitException lex) {
                    System.out.println(le.getMessage());
                }
                break;
            }
        }
    }
}
