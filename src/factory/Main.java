package factory;

public class Main {
    public static void main(String[] args) {
        PromotionFactory promotionFactory = new PromotionFactory();
        Salesman salesman = new Salesman(promotionFactory);

        // 春节促销活动
        salesman.showPromotion("春节");

        // 中秋节促销活动
        salesman.showPromotion("中秋节");

        // 圣诞节促销活动
        salesman.showPromotion("圣诞节");
    }
}
