package StructuralDP.FacadeDp;

public class Waiter {
    public static String deliverFood(FoodType food) {
        switch (food) {
            case PIZZA:
                Food pizza = new Pizza();
                String smaan = Ingredient.pizzaIngredient();
                pizza.prepareFood(smaan);
                return pizza.deliverfood();
            case PASTA:
                Food pasta = new Pasta();
                String pastaSmaan = Ingredient.pastaIngredient();
                pasta.prepareFood(pastaSmaan);
                return pasta.deliverfood();
        }
        return null;
    }

}
