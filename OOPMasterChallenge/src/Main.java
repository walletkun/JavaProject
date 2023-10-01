public class Main {
    public static void main(String[] args) {


        // MealOrder regularMeal = new MealOrder();
        // regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        // regularMeal.setDrinkSize("LARGE");
        // regularMeal.printItemizedList();

        // MealOrder secondOrder = new MealOrder("turkey", "7-up", "chili");
        // secondOrder.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        // secondOrder.setDrinkSize("SMALL");
        // secondOrder.printItemizedList();
        // Item item1 = new Item("salmon", "coke", 1.5);
        // item1.setIce("ice");
        // item1.printItem();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-UP", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE","CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");


    }
}
