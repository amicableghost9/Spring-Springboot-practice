package demo;


import org.springframework.stereotype.Component;

@Component
public class ShoppingCart
{
    //Logging
    //authentication and authorization
    //sanitize the data
    public void checkout(String status)
    {
        System.out.println("checkout method from ShoppingCart called");
    }

    public int quantity()
    {
        return 2;
    }
}
