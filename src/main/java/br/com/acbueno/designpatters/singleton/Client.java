package br.com.acbueno.designpatters.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.singleton.simple.conn.Connection;
import br.com.acbueno.designpatters.singleton.simple.conn.ConnectionPool;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void doQueryOne() {
    ConnectionPool pool = ConnectionPool.getInstnace();
    Connection conn = pool.getConnection();

    if(conn != null) {
      conn.query("SELECT * FROM DB1");
    }
  }

  public static void doQueryTwo() {
    ConnectionPool pool = ConnectionPool.getInstnace();
    Connection conn = pool.getConnection();

    if(conn != null) {
      conn.query("SELECT * FROM DB2");
    }
  }

  public static void doQueryThree() {
    ConnectionPool pool = ConnectionPool.getInstnace();
    Connection conn = pool.getConnection();

    if(conn !=null) {
      conn.query("SLEECT * FROM DB3");
    }
  }

  public static void main(String[] args) {
    LOGGER.info("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
    int pool = ConnectionPool.POOL_SIZE;
    LOGGER.info("Pool:" + pool);
    doQueryOne();
    doQueryTwo();
    doQueryThree();
  }

}
