package br.com.acbueno.designpatters.chain.middleware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);
  private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  private static Server server;

  public static void init() {
    server = new Server();
    server.register("admin@example.com", "admin_pass");
    server.register("user@example.com", "user_pass");

    Middleware middleware = new ThrottlingMiddleware(2);
    middleware.linkWith(new UserExistsMiddleware(server).linkWith(new RoleCheckMiddleware()));

    server.setMiddleware(middleware);
  }

  public static void main(String[] args) throws IOException {

    init();
    boolean success = false;
    do {
      LOGGER.info("Enter email: ");
      String email = reader.readLine();
      LOGGER.info("Enter password");
      String password = reader.readLine();

      success = server.logIn(email, password);
    } while (!success);

  }

}
