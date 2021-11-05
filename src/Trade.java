import Shop.Shop;
import Shop.Customer;

import java.util.Scanner;

public class Trade
{
    private Shop shop;
    private Customer customer;
    Scanner scanner;

    public Trade(Shop shop, Customer customer)
    {
        this.shop = shop;
        this.customer = customer;
        scanner = new Scanner(System.in);
    }

    public boolean doTrade()
    {
        switch (selectCommand(scanner))
        {
            case 1:
                System.out.println("Subtotal: " + customer.put(shop.take(selectProduct(scanner))));
                System.out.println(customer);
                break;
            case 2:
                if(customer.getSubTotal() == 0)
                    System.out.println("Nothing bought!");
                else
                    System.out.println("Successful purchase!\n Total: " + customer.buy());
                System.out.println(shop);
                break;
            case 0:
                return false;
            default:
                System.out.println("Wrong command!");
        }
        return true;
    }

    private int selectProduct(Scanner scanner)
    {
        System.out.println(new StringBuilder().
        append("Select a product:\n").
        append("1 - Milk; ").
        append("2 - Butter; ").
        append("3 - Bread; ").
        append("4 - Hammer; ").
        append("5 - Screwdriver; ").
        append("6 - Shovel\n"));

        while (!scanner.hasNextInt())
        {
            System.out.println("It's not an integer!");
            System.out.println("Select a product:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int selectCommand(Scanner scanner)
    {
        System.out.println(new StringBuilder().
        append("1 - select item to cart\n").
        append("2 - buy\n").
        append("0 - exit\n"));

        while (!scanner.hasNextInt())
        {
            System.out.println("It's not an integer!");
            System.out.println("Enter command:");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
