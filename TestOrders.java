import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.99;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 4.49;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 2.99;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 4.99;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 0.0;
        order1.ready = false;
        order1.items = new ArrayList<>();

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 0.0;
        order2.ready = false;
        order2.items = new ArrayList<>();

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 0.0;
        order3.ready = false;
        order3.items = new ArrayList<>();

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 0.0;
        order4.ready = false;
        order4.items = new ArrayList<>();

        // Application Simulations
        System.out.println(order1); 

        // Predicting order1.total
        System.out.println(order1.total); 

        // Adding item1 to order2's item list and updating the total
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 orders a cappuccino
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 adds a latte
        order4.items.add(item2);
        order4.total += item2.price;

        // Updating Cindhuri's order status to ready
        order1.ready = true;

        // Sam orders 2 lattes
        order4.items.add(item2);
        order4.total += item2.price * 2;

        // Updating Jimmy's order status to ready
        order2.ready = true;
        
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
