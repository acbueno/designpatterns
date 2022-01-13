package br.com.acbueno.designpatters.templatemethod.sales.model.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.templatemethod.sales.model.Cart;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.template.BestOfferTemplate;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.template.BigCartDiscounts;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.template.BlackFriday;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.template.CategoryDiscount;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.template.FreeDelivery;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.template.RegularPrice;
import br.com.acbueno.designpatters.templatemethod.sales.model.service.template.SpecialClient;


public class BestOfferService {


  private static final Logger LOGGER = LoggerFactory.getLogger(BestOfferService.class);
  private List<BestOfferTemplate> templates;

  private void loadTemplates(Cart cart) {
    templates = new ArrayList<>();
    templates.add(new RegularPrice(cart));
    templates.add(new FreeDelivery(cart));
    templates.add(new BigCartDiscounts(cart));
    templates.add(new SpecialClient(cart));
    templates.add(new CategoryDiscount(cart));
    templates.add(new BlackFriday(cart));
  }

  public void calculateBestOffer(Cart cart) {
    loadTemplates(cart);
    Double bestOffer = Double.MAX_VALUE;

    for (BestOfferTemplate bestOfferTemplate : templates) {
      if(bestOfferTemplate.isAppliable()) {
         Double currentPrice = bestOfferTemplate.calculateOffer(cart);
         LOGGER.info(String.format("%s: %.2f", bestOfferTemplate.getClass().getSimpleName(), currentPrice));
         bestOffer = (bestOffer > currentPrice) ? currentPrice: bestOffer;
      }

    }
    LOGGER.info(String.format("Final Price: %.2f", bestOffer));
  }

}
