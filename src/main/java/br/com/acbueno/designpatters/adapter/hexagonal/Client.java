package br.com.acbueno.designpatters.adapter.hexagonal;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.adapter.hexagonal.application.UserRest;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    UserRest userRestApi = new UserRest();
    Map<String, String> body = new HashMap<String, String>();
    body.put("email", "user01@email.com");
    body.put("name", "User 1");
    body.put("password", "123");
    Integer statusCode = userRestApi.post(body);

    LOGGER.info(statusCode.toString());

    statusCode = userRestApi.get();
    LOGGER.info(statusCode.toString());

    body.put("email", "user02@email.com");
    body.put("name", "User 2");
    statusCode = userRestApi.post(body);
    LOGGER.info(statusCode.toString());

    body.put("email", "user02@email.com");
    body.put("name", "User 2");
    statusCode = userRestApi.post(body);
    LOGGER.info(statusCode.toString());

    statusCode = userRestApi.get();
    LOGGER.info(statusCode.toString());



  }

}
