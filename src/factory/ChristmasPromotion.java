package factory;

class ChristmasPromotion implements Promotion {
    @Override
    public void display() {
        System.out.println("圣诞节促销活动：打折促销、主题展销等");
    }
}