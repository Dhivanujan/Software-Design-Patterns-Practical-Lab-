package Template.Task31;

public class Main {

    public static void main(String[] args) {

        FoodOrder burger = new BurgerOrder();
        burger.processOrder();

        System.out.println();

        FoodOrder pizza = new PizzaOrder();
        pizza.processOrder();
    }
}