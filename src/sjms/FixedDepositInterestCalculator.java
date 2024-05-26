package sjms;

// 定期账号利息计算器
class FixedDepositInterestCalculator extends InterestCalculator {
    @Override
    protected double getInterestRate(Account account) {
        // 定期账号的利息率根据不同的存期而变化，这里简单示意为根据账户信息获取
        return account.getInterestRate();
    }

    @Override
    protected int getTerm(Account account) {
        // 定期账号的账期固定为存期
        return account.getTerm();
    }
}
