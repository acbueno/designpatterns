package br.com.acbueno.designpatters.templatemethod.sales;

import java.util.Arrays;

import br.com.acbueno.designpatters.templatemethod.sales.model.Buyer;
import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;
import br.com.acbueno.designpatters.templatemethod.sales.model.Category;
import br.com.acbueno.designpatters.templatemethod.sales.model.Product;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.BestOfferService;

public class Client {

  public static void main(String[] args) {

    Buyer simpleBuyer1 = new Buyer("Simple #1", 1500, false);
    Buyer simpleBuyer2 = new Buyer("Simple #2", 3000, false);
    Buyer specialBuyer = new Buyer("Special #1", 500, true);
    Buyer specialBuyer2 = new Buyer("Special #2", 3000, true);

    Product notebook = new Product("Notebook", 999.99d, Category.ELETRONICS, 10d);
    Product shoes = new Product("Nike Shoes", 20d, Category.SPORTS, 1.25d);
    Product shorts = new Product("T-Shirt", 10d, Category.CLOTHES, 0.5d);
    Product mouse = new Product("Mouse", 10d, Category.ELETRONICS, 0.2d);

    Cart cart1 = new Cart(simpleBuyer1, Arrays.asList(notebook, shoes, shorts, mouse));
    Cart cart2 = new Cart(simpleBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
    Cart cart3 = new Cart(specialBuyer, Arrays.asList(notebook, shoes, shorts, mouse));
    Cart cart4 = new Cart(specialBuyer2, Arrays.asList(notebook, shoes, shorts, mouse));
    Cart cart5 = new Cart(specialBuyer2, Arrays.asList(notebook));
    Cart cart6 = new Cart(specialBuyer2, Arrays.asList(shorts));

    BestOfferService service = new BestOfferService();
    service.calculateBestOffer(cart1);

    service.calculateBestOffer(cart2);

    service.calculateBestOffer(cart3);

    service.calculateBestOffer(cart4);

    service.calculateBestOffer(cart5);

    service.calculateBestOffer(cart6);

  }

}
