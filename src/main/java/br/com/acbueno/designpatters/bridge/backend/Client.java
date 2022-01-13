package br.com.acbueno.designpatters.bridge.backend;

import br.com.acbueno.designpatters.bridge.backend.dao.UserMongoDao;
import br.com.acbueno.designpatters.bridge.backend.dao.UserMysqlDao;
import br.com.acbueno.designpatters.bridge.backend.dao.UserOracleDao;
import br.com.acbueno.designpatters.bridge.backend.dao.UserPostgresDao;
import br.com.acbueno.designpatters.bridge.backend.model.User;
import br.com.acbueno.designpatters.bridge.backend.services.UserEJB;
import br.com.acbueno.designpatters.bridge.backend.services.UserRest;
import br.com.acbueno.designpatters.bridge.backend.services.UserService;
import br.com.acbueno.designpatters.bridge.backend.services.UserSoap;

public class Client {

  public static void main(String[] args) {
    User user = new User("user", "user@email.com", "passwd");

    UserService userServiceRest = new UserRest(new UserOracleDao());
    userServiceRest.save(user);

    UserService userEJBMongoService = new UserEJB(new UserMongoDao());
    userEJBMongoService.save(user);

    UserService userSoapPostService = new UserSoap(new UserPostgresDao());
    userSoapPostService.save(user);

    UserService userRestMysqlService = new UserRest(new UserMysqlDao());
    userRestMysqlService.save(user);

  }

}
