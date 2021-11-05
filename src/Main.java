import Goods.Grocery.Milk;
import Shop.Shop;

import java.time.LocalDateTime;

public class Main
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        LocalDateTime dateTime = LocalDateTime.now();

        shop.add(new Milk(100,0, dateTime));
        shop.add(new Milk(100,0, dateTime.plusHours(1)));
        shop.add(new Milk(100,0, dateTime.plusHours(2)));

        System.out.println(shop);
    }
}
