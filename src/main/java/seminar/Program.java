package seminar;

public class Program {
    public static void main(String[] args) {

        MenuItem pizza = new MenuItem("Pizza");
        MenuItem pasta = new MenuItem("Pasta");
        MenuItem salad = new MenuItem("Salad");

        Menu drinksMenu = new Menu("Drinks");
        Menu dessertsMenu = new Menu("Dessert");

        MenuItem cola = new MenuItem("Cola");
        MenuItem water = new MenuItem("Water");
        MenuItem cake = new MenuItem("Cake");
        MenuItem iceCream = new MenuItem("IceCream");

        drinksMenu.add(cola);
        drinksMenu.add(water);

        dessertsMenu.add(cake);
        dessertsMenu.add(iceCream);

        Menu mainMenu = new Menu("Menu");
        mainMenu.add(pizza);
        mainMenu.add(pasta);
        mainMenu.add(salad);
        mainMenu.add(drinksMenu);
        mainMenu.add(dessertsMenu);

        System.out.println("Initial Menu:");
        mainMenu.display(0);

        mainMenu.add(water);
        System.out.println("\nWater added again (won't duplicate):");
        mainMenu.display(0);

        mainMenu.remove(dessertsMenu);
        System.out.println("\nDesserts removed:");
        mainMenu.display(0);
    }
}
