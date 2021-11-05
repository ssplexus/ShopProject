import Goods.Grocery.Bread;
import Goods.Grocery.Butter;
import Goods.Grocery.Milk;
import Goods.Household.Hammer;
import Goods.Household.Screwdriver;
import Goods.Household.Shovel;
import Shop.Shop;
import Shop.Customer;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        Customer customer = new Customer();
        Trade trade = new Trade(shop, customer);
        LocalDateTime dateTime = LocalDateTime.now();

        shop.add(new Milk(50, dateTime));
        shop.add(new Milk(50, dateTime.plusHours(1)));
        shop.add(new Milk(50, dateTime.plusHours(2)));

        shop.add(new Butter(100, dateTime));
        shop.add(new Butter(100, dateTime.plusHours(1)));
        shop.add(new Butter(100, dateTime.plusHours(2)));
        shop.add(new Butter(100, dateTime.plusHours(3)));

        shop.add(new Bread(10, dateTime));
        shop.add(new Bread(10, dateTime.plusHours(1)));

        shop.add(new Shovel(1000, new Random().nextInt(100000)));
        shop.add(new Shovel(1000, new Random().nextInt(100000)));
        shop.add(new Hammer(400, new Random().nextInt(100000)));
        shop.add(new Hammer(400, new Random().nextInt(100000)));
        shop.add(new Screwdriver(300, new Random().nextInt(100000)));
        shop.add(new Screwdriver(300, new Random().nextInt(100000)));

        Scanner scanner = new Scanner(System.in);

        System.out.println(shop);
        do
        {
        }
        while (trade.doTrade());

    }
}
