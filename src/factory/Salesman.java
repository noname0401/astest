package factory;

class Salesman {
    private PromotionFactory promotionFactory;

    public Salesman(PromotionFactory promotionFactory) {
        this.promotionFactory = promotionFactory;
    }

    // 展示指定节日的促销活动
    public void showPromotion(String festival) {
        Promotion promotion = promotionFactory.createPromotion(festival);
        promotion.display();
    }
}
