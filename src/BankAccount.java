public class BankAccount {
    private Double amount = 0.0;
    public Double getAmount() {
        return amount;
    }
    public Double deposit(Double sum){
       amount += sum;
        return amount;
    }
    public Double withDraw (Integer sum) throws LimitException {
        if (amount >= sum ) {
          return amount -= sum;

        }
        else {
    throw new LimitException("Ошибка! к сожалению на вашем балансе недостаточно средств для снянитя " + sum +
                " по этому мы сняли оставшуюся сумму " + getAmount(), getAmount());
        }
    }
    public Double withDraw (Double sum) throws LimitException {
        if (amount >= sum ) {
            amount -= sum;
            return amount;
        }
        else {
            throw new LimitException("Ошибка! к сожалению на вашем балансе недостаточно средств для снянитя " + sum +
                    " по этому мы сняли оставшуюся сумму " + getAmount(), getAmount());
        }
    }
}
