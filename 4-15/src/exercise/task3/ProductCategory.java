package exercise.task3;

// 商品カテゴリの列挙型
public enum ProductCategory {
    // FRUITS, VEGETABLES, DAIRYを定義
    // それぞれ表示名（"果物", "野菜", "乳製品"）を持たせる
    FRUITS("果物"),
    VEGETABLES("野菜"),
    DAIRY("乳製品");
    
    private final String displayName;
    
    ProductCategory(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}
