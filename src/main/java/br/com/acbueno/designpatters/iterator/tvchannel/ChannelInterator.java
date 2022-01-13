package br.com.acbueno.designpatters.iterator.tvchannel;

import java.util.Iterator;

public class ChannelInterator implements Iterator<Integer> {

  private Integer[] channels;
  private int index;

  public ChannelInterator(Integer[] channels) {
    this.channels = channels;
    this.index =0;
  }

  @Override
  public boolean hasNext() {
    if( channels == null) {
      return false;
    }
    return channels[index] != null;
  }

  @Override
  public Integer next() {
    return channels[index++];
  }

}
