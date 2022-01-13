package br.com.acbueno.designpatters.singleton.simple.conn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Connection {

  private static final Logger LOGGER = LoggerFactory.getLogger(Connection.class);
  private boolean inUse;

  public Connection() {
    inUse = false;
  }

  public Object query(String sql) {
    LOGGER.info("Running '" + sql + "' In Connection " + this);
    return null;
  }


}
