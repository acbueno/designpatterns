package br.com.acbueno.designpatters.adapter.tv.port;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.designpatters.adapter.tv.port.adapter.HdmiToOldMonitorAdapter;
import br.com.acbueno.designpatters.adapter.tv.port.devices.Computer;
import br.com.acbueno.designpatters.adapter.tv.port.devices.OldMonitor;
import br.com.acbueno.designpatters.adapter.tv.port.devices.TV;

public class Client {

  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

  public static void main(String[] args) {
    Computer cp = new Computer();
    TV tv = new TV();
    cp.connectPort(tv);
    cp.sendImageAndSound("Metropolis part II", "Dream Theater");

    Computer cp2 = new Computer();
    OldMonitor monitor = new OldMonitor();

    LOGGER.info("---Monitor Adapter--");

    Computer cp3 = new Computer();
    HdmiToOldMonitorAdapter monitorAdapter = new HdmiToOldMonitorAdapter();
    cp3.connectPort(monitorAdapter);
    cp3.sendImageAndSound("Metropolis part II", "Dream Theater");


  }

}
