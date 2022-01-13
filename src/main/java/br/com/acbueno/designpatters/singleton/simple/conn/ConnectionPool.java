package br.com.acbueno.designpatters.singleton.simple.conn;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionPool {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionPool.class);
  private static ConnectionPool instance = new ConnectionPool();
  public final static int POOL_SIZE = 2;
  private List<Connection> connectionPool;

  public static ConnectionPool getInstnace() {
    return instance;
  }

  private ConnectionPool() {
    LOGGER.info("Creating Connection Pool");
    connectionPool = new ArrayList<Connection>();

    for (int i = 0; i < POOL_SIZE; i++) {
      connectionPool.add(new Connection());
    }
  }

  public Connection getConnection() {
    Connection avaiable = null;

    for (Connection conn : connectionPool) {
      if (!conn.isInUse()) {
        avaiable = conn;
        break;
      }
    }

    if (avaiable == null) {
      LOGGER.info("No connections avaiable");
      return null;
    }
    avaiable.setInUse(true);

    return avaiable;
  }

  public void leaveConnection(Connection conn) {
    conn.setInUse(false);
  }

}
