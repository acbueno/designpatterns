package br.com.acbueno.designpatters.mediator;

import br.com.acbueno.designpatters.mediator.meditator.ChatMediator;
import br.com.acbueno.designpatters.mediator.meditator.Mediator;
import br.com.acbueno.designpatters.mediator.meditator.TranslatorMediator;
import br.com.acbueno.designpatters.mediator.model.EnglishUser;
import br.com.acbueno.designpatters.mediator.model.PortuguenseUser;
import br.com.acbueno.designpatters.mediator.model.User;

public class Client {

  public static void main(String[] args) {
    Mediator chatRoom = new ChatMediator();
    //Mediator chatRoom = new TranslatorMediator();

    User rambo = new EnglishUser("Rambo", chatRoom);
    User lindoval = new PortuguenseUser("Lindoval", chatRoom);
    User clarie  = new EnglishUser("Clarie", chatRoom);
    User maria = new PortuguenseUser("Maria", chatRoom);

    chatRoom.addUser(rambo);
    chatRoom.addUser(lindoval);
    chatRoom.addUser(maria);

    rambo.sendMessage("Hi");
    maria.sendMessage("Oi", rambo);

    chatRoom.removeUser(clarie);

    rambo.sendMessage("How are you?", maria);
    maria.sendMessage("Estou bem, obrigado.", rambo);

    lindoval.sendMessage("Oi");

    chatRoom.removeUser(maria);
  }

}
