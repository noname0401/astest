package factory;

class PromotionFactory {
    // 根据节日名称创建对应的促销活动对象
    public Promotion createPromotion(String festival) {
        switch (festival) {
            case "春节":
                return new SpringFestivalPromotion();
            case "中秋节":
                return new MidAutumnPromotion();
            case "圣诞节":
                return new ChristmasPromotion();
            default:
                throw new IllegalArgumentException("Unsupported festival: " + festival);
        }
    }
}
