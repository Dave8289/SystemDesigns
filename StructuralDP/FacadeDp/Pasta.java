package StructuralDP.FacadeDp;

public class Pasta implements Food {
    private String preparingItem;

    @Override
    public void prepareFood(String foodItems) {
        preparingItem = "Thin Crust pasta";
    }

    @Override
    public String deliverfood() {
        return preparingItem;
    }
}
