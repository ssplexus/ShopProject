import Shop.Shop;
import Shop.Customer;

import java.util.Scanner;

/**
 * Класс торговли (взаимодействия магазина и покупателя)
 */
public class Trade
{
    private final Shop shop;
    private final Customer customer;
    Scanner scanner;

    /**
     *  Конструктор торговли
     *
     * @param shop - объект магазина
     * @param customer - объект покупателя
     */
    public Trade(Shop shop, Customer customer)
    {
        this.shop = shop;
        this.customer = customer;
        scanner = new Scanner(System.in);
    }

    /**
     * Основной метод класса торговли
     * @return возвращает истину пока не выбрана команда выхода
     */
    public boolean doTrade()
    {
        // Запрос команды пользователя
        switch (selectCommand(scanner))
        {
            case 1: // Добавление товара в корзину
                System.out.println("Subtotal: " + customer.put(shop.take(selectProduct(scanner))));
                System.out.println(customer);
                break;
            case 2: // Осуществление покупки
                if(customer.getSubTotal() == 0)
                    System.out.println("Nothing bought!");
                else
                    System.out.println("Successful purchase!\n Total: " + customer.buy());
                System.out.println(shop);
                break;
            case 0: // Выход из магазина
                return false;
            default:
                System.out.println("Wrong command!");
        }
        return true;
    }

    // Метод выбора продукта
    private int selectProduct(Scanner scanner)
    {
        System.out.println("Select a product:\n" +
                "1 - Milk; " +
                "2 - Butter; " +
                "3 - Bread; " +
                "4 - Hammer; " +
                "5 - Screwdriver; " +
                "6 - Shovel\n");

        while (!scanner.hasNextInt())
        {
            System.out.println("It's not an integer!");
            System.out.println("Select a product:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Метод запроса команды
    private int selectCommand(Scanner scanner)
    {
        System.out.println("1 - select item to cart\n" +
                "2 - buy\n" +
                "0 - exit\n");

        while (!scanner.hasNextInt())
        {
            System.out.println("It's not an integer!");
            System.out.println("Enter command:");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
