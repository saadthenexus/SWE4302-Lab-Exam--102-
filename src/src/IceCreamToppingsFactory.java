package src;

public class IceCreamToppingsFactory {
    public static IceCreamToppings getToppings(String toppings){
        toppings = toppings.toLowerCase();
        if(toppings.equals("marshmallow")){
            return new Marshmallow();
        }else if(toppings.equals("sprinkles")){
            return new Sprinkles();
        }else if(toppings.equals("chocolatechips")){
            return new ChocolateChips();
        }else if(toppings.equals("crushedoreo")){
            return new CrushedOreo();
        }else if(toppings.equals("freshstrawberries")){
            return new FreshStrawberries();
        }else{
            throw new UnsupportedOperationException();
        }
    }
}
