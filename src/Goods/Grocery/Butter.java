package Goods.Grocery;

import java.time.LocalDateTime;


public class Butter extends Grocery
{
    public Butter(int price, LocalDateTime creationDateTime)
    {
        super("Butter", price, creationDateTime);
    }
}
