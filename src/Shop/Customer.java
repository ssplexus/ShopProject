package Shop;

import Goods.Product;

import java.util.Stack;

/**
 *  Класс покупателя
 */
public class Customer
{
    // Корзина покупателя
    private final Stack<Product> cart;

    // Подитог
    private int subTotal;

    /**
     * Конструктор покупателя
     */
    public Customer()
    {
        cart = new Stack<>();
        subTotal = 0;
    }

    /**
     * метод положить товар в корзину
     * @param product - товар
     * @return - подитог
     */
    public int put(Product product)
    {
        if(product != null) subTotal += cart.push(product).getPrice();
        return subTotal;
    }

    /**
     * Метод покупки
     * @return - итог
     */
    public int buy()
    {
        int total = 0;
        while (!cart.isEmpty()) // выкладываем из корзины пока она не пуста
        {
            total += cart.pop().getPrice();
        }
        subTotal = 0;
        return total;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer's cart: ");
        if(cart.isEmpty()) sb.append("is empty");
        else
        {
            for(Product product: cart)
            {
                sb.append("[").append(product.getName()).append("]").append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * Вывести подитог
     * @return - подитог
     */
    public int getSubTotal()
    {
        return subTotal;
    }
}
