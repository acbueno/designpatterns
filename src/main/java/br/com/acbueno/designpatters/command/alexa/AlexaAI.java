package br.com.acbueno.designpatters.command.alexa;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class AlexaAI {

  private Map<String, String[]> associations;

  public AlexaAI() {
    associations = new HashMap<>();
  }

  public void addAssociation(String key, String[] assocation) {
    associations.put(key, assocation);
  }

  public String getFindAssociations(String request) {
    for (String[] association : associations.values()) {
      if (Stream.of(association).allMatch(request::contains)) {
        return getKeyFromAssociatons(association);
      }
    }
    return null;
  }

  private String getKeyFromAssociatons(String... keywords) {
    return associations
        .entrySet()
        .stream().
        filter(entry -> keywords.equals(entry.getValue()))
        .map(Map.Entry::getKey)
        .findFirst().get();
  }

}
