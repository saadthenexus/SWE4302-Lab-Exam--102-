package test;

import org.junit.jupiter.api.Test;

import src.Order;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    
    @Test
    public void testSubtotalAfterBuyingMintChocolateChips(){
        Order order = new Order();
        order.addScoop("ChocolateFudge", 1);
        assertEquals(3.00, order.getPrice());
    }

    @Test
    public void testSubTotalAfterBuyingStrawberrySwirl(){
        Order order = new Order();
        order.addScoop("strawberryswirl", 1);
        assertEquals(2.75, order.getPrice());
    }

}
