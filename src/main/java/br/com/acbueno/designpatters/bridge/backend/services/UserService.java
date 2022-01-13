package br.com.acbueno.designpatters.bridge.backend.services;

import br.com.acbueno.designpatters.bridge.backend.dao.UserDao;
import br.com.acbueno.designpatters.bridge.backend.model.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class UserService {
  protected UserDao dao;

  public abstract void save(User user);

}
