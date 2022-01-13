package br.com.acbueno.designpatters.mediator.meditator;

import br.com.acbueno.designpatters.mediator.model.User;
import br.com.acbueno.designpatters.mediator.services.TranslatorService;

public class TranslatorMediator extends Mediator {

  private TranslatorService translatorService  = new TranslatorService();

  @Override
  protected String getMessage(String message, User to, User from) {
    return translatorService.getTranslation(from.getLanguage(), to.getLanguage(), message);
  }

}
