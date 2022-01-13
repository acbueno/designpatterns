package br.com.acbueno.designpatters.bridge.backend.dao;

import br.com.acbueno.designpatters.bridge.backend.model.User;

public interface UserDao {

  void save(User user);

}
