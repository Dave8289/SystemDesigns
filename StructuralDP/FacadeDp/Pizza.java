package StructuralDP.FacadeDp;

public class Pizza implements Food {
    private String preparingItem;

    @Override
    public void prepareFood(String foodItems) {
        preparingItem = "Thin Crust pizza";
    }

    @Override
    public String deliverfood() {
        return preparingItem;
    }

}
