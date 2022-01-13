package br.com.acbueno.designpatters.iterator.tvchannel;

import java.util.Iterator;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TV implements Iterable<Integer> {

  private static final Logger LOGGER = LoggerFactory.getLogger(TV.class);
  private Integer[] channels;

  public void searchAvaiableChannels() {
    this.channels = new Integer[30];
    Random random = new Random();
    int channelsCount =0;

    for(int i=0;i<channels.length; i++) {
      if(random.nextInt(2) == 1) {
        channels[channelsCount++] =i;
      }
    }
    LOGGER.info(String.format("Found %d channels...", channelsCount));
  }

  @Override
  public Iterator<Integer> iterator() {
    return new ChannelInterator(channels);
  }

}
