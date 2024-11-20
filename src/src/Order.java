package src;

public class Order {
    private double price;

    public void addScoop(String flavour, int quantity){
        IceCreamFlavour iceCreamFlavour = IceCreamFlavourFactory.getFlavour(flavour);
        price += quantity * iceCreamFlavour.getPerScoopPrice();
    }

    public void addToppings(String toppings, int quantity){
        IceCreamToppings iceCreamToppings = IceCreamToppingsFactory.getToppings(toppings);
        price += quantity * iceCreamToppings.getPrice();
    }

    public double getPrice(){
        return price;
    }
}
