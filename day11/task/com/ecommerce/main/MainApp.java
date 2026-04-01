package com.ecommerce.main;
import java.util.Scanner;
import com.ecommerce.service.CartService;
import com.ecommerce.model.Product;
import com.ecommerce.util.DiscountUtil;

public class MainApp {
    public static void main(String[] args) {
        CartService cart = new CartService();
        
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int currId = 2; 

        while (res != 4) {
            IO.println("Ecommerce app");
            IO.println("1. add product\n2. show cart\n3. calculate total\n4. exit");
            
            res = sc.nextInt();
            sc.nextLine();

            switch (res) {
                case 1:
                    IO.println("Enter name:");
                    String productName = sc.nextLine();
                    
                    IO.println("Enter price:");
                    int price = sc.nextInt();
                    sc.nextLine();
                    
                    currId++;
                    cart.addProduct(new Product(currId, productName, price));
                    break;

                case 2:
                    cart.showCart();
                    break;
                case 3:
                    IO.println(cart.calculateTotal());
                    break;
                case 4:
                    IO.println("thank you");
                    break;
            }
        }
        sc.close();
    }
}
