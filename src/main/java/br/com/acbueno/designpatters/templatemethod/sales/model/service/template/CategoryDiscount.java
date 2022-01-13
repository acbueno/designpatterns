package br.com.acbueno.designpatters.templatemethod.sales.model.service.template;

import java.util.HashMap;
import java.util.Map;
import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;
import br.com.acbueno.designpatters.templatemethod.sales.model.Category;

public class CategoryDiscount extends BestOfferTemplate {

  Map<Category, Double> discountsByCategory;

  public CategoryDiscount(Cart cart) {
   super(cart);
   loadDiscounts();
  }

  public void loadDiscounts() {
    discountsByCategory = new HashMap<>();
    discountsByCategory.put(Category.ELETRONICS, 0.3);
    discountsByCategory.put(Category.CLOTHES, 0.05);
  }

  @Override
  public boolean isAppliable() {
    return true;
  }

  @Override
  public void calibrateVariables() {

    Category category = cart.getItems().get(1).getCategory();

    regularItemsPrice = cart.getItems().stream()
        .reduce(0d, (acc, item) ->
          acc + (item.getValue() *
              (discountsByCategory.get(item.getCategory()) != null?
                  1 - discountsByCategory.get(item.getCategory()): 1d))
        , Double::sum);
  }

}
