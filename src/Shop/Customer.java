package Shop;

import Goods.Product;

import java.util.Stack;

public class Customer
{
    private Stack<Product> cart;

    private int subTotal;

    public Customer()
    {
        cart = new Stack<>();
        subTotal = 0;
    }

    public int put(Product product)
    {
        if(product != null) subTotal += cart.push(product).getPrice();
        return subTotal;
    }

    public int buy()
    {
        int total = 0;
        while (!cart.isEmpty())
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
                sb.append("[" + product.getName() + "]" + " ");
            }
        }
        return sb.toString();
    }

    public int getSubTotal() {
        return subTotal;
    }
}
