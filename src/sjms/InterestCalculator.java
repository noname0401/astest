package sjms;

// 模板类
abstract class InterestCalculator {
    // 模板方法，定义了利息计算的框架
    public final double calculateInterest(Account account) {
        double balance = account.getBalance();
        double interestRate = getInterestRate(account);
        int term = getTerm(account);
        return calculate(balance, interestRate, term);
    }

    // 抽象方法，由子类实现不同类型用户的利息率获取逻辑
    protected abstract double getInterestRate(Account account);

    // 抽象方法，由子类实现不同类型用户的账期获取逻辑
    protected abstract int getTerm(Account account);

    // 具体方法，利息计算逻辑，可由子类覆盖
    protected double calculate(double balance, double interestRate, int term) {
        return balance * interestRate * term;
    }
}