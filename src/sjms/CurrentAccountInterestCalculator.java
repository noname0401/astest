package sjms;

// 活期账号利息计算器
class CurrentAccountInterestCalculator extends InterestCalculator {
    @Override
    protected double getInterestRate(Account account) {
        // 活期账号的利息率固定为0.01
        return 0.01;
    }

    @Override
    protected int getTerm(Account account) {
        // 活期账号的账期固定为1
        return 1;
    }
}

