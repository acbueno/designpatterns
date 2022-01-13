package br.com.acbueno.designpatters.chain.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.acbueno.designpatters.chain.process.service.GenericService;
import br.com.acbueno.designpatters.chain.process.service.ProcessContext;
import br.com.acbueno.designpatters.chain.process.service.ServicesCatalog;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    ProcessContext ctx = new ProcessContext();
    ctx.put("email", "anotherUser@email.com");
    ctx.put("password", "1234");
    Object response = GenericService.run(ServicesCatalog.saveProcess, ctx);
    LOGGER.info(response.toString());

    ctx.reset();
    ctx.put("email", "anotherUser@email.com");
    ctx.put("password", "1234");
    ctx.put("name", "Another User");
    response = GenericService.run(ServicesCatalog.saveProcess, ctx);
    LOGGER.info(response.toString());

    ctx.reset();
    ctx.put("email", "user@email.com");
    ctx.put("password", "123456");
    response = GenericService.run(ServicesCatalog.loginProcess, ctx);
    LOGGER.info(response.toString());

    ctx.reset();
    ctx.put("token", "USER@EMAIL.COM");
    response = GenericService.run(ServicesCatalog.getUsersProcess, ctx);
    LOGGER.info(response.toString());

    ctx.reset();
    ctx.put("token", "Invalid token");
    response = GenericService.run(ServicesCatalog.getUsersProcess, ctx);
    LOGGER.info(response.toString());

  }

}
