package br.com.acbueno.designpatters.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.prototype.model.Address;
import br.com.acbueno.designpatters.prototype.model.User;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) throws CloneNotSupportedException {

    User user = new User("Clone", 30, new Address("Rua Aragao", 1030));
    User cloneUser = user.clone();
    cloneUser.setName("Clone X2");
    cloneUser.getAddress().setStreet("Rua Trapalhoes");
    LOGGER.info(String.format("Dado Matriz %s", user.toString()));
    LOGGER.info(String.format("Dado clonado e alterado:  %s", cloneUser.toString()));

  }

}
