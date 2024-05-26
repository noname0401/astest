package sjms;

public class Account {
    private double balance;
    private double interestRate;
    private int term;

    // 构造方法
    public Account(double balance, double interestRate, int term) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.term = term;
    }

    // 默认构造方法
    public Account() {
        // 默认值
        this.balance = 0;
        this.interestRate = 0;
        this.term = 0;
    }

    // 获取账户余额
    public double getBalance() {
        return balance;
    }

    // 设置账户余额
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 获取利息率
    public double getInterestRate() {
        return interestRate;
    }

    // 设置利息率
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // 获取存期
    public int getTerm() {
        return term;
    }

    // 设置存期
    public void setTerm(int term) {
        this.term = term;
    }
}
