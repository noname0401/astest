package sjms;

public class TestInterestCalculator {
    public static void main(String[] args) {
        // 创建一个活期账户
        Account currentAccount = new Account();
        currentAccount.setBalance(1000); // 设置账户余额为1000
        // 创建一个定期账户
        Account fixedDepositAccount = new Account();
        fixedDepositAccount.setBalance(5000); // 设置账户余额为5000
        fixedDepositAccount.setInterestRate(0.05); // 设置利息率为5%
        fixedDepositAccount.setTerm(3); // 设置存期为3年

        // 创建活期账户利息计算器对象
        InterestCalculator currentCalculator = new CurrentAccountInterestCalculator();
        // 创建定期账户利息计算器对象
        InterestCalculator fixedDepositCalculator = new FixedDepositInterestCalculator();

        // 计算活期账户利息并打印结果
        double currentInterest = currentCalculator.calculateInterest(currentAccount);
        System.out.println("活期账户利息：" + currentInterest);

        // 计算定期账户利息并打印结果
        double fixedDepositInterest = fixedDepositCalculator.calculateInterest(fixedDepositAccount);
        System.out.println("定期账户利息：" + fixedDepositInterest);
    }
}

