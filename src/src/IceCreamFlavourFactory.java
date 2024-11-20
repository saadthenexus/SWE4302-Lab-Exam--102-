package src;

public class IceCreamFlavourFactory {
    public static IceCreamFlavour getFlavour(String flavour){
        flavour = flavour.toLowerCase();
        if(flavour.equals("chocolatefudge")){
            return new ChocolateFudge();
        }else if(flavour.equals("mintchocolatechip")){
            return new MintChocolateChip();
        }else if(flavour.equals("pistachiodelight")){
            return new PistachioDelight();
        }else if(flavour.equals("strawberryswirl")){
            return new StrawberrySwirl();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
