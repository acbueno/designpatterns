package br.com.acbueno.designpatters.mediator.services;

import java.util.HashMap;
import java.util.Map;

import br.com.acbueno.designpatters.mediator.model.Language;

public class TranslatorService {

  Map<String, String> engToPor = new HashMap<>();
  Map<String, String> porToEng = new HashMap<>();

  public TranslatorService() {
    porToEng.put("Oi", "Hi");
    porToEng.put("Tudo bem?", "How's going");
    porToEng.put("Estou bem, obrigado.", "I'm fine, thanks");
    porToEng.put("Tchau", "Bye");
    engToPor.put("Hi",  "Oi");
    engToPor.put("How are you?", "Tudo bem?");
    engToPor.put("I'm fine, thanks", "Estou bem, obrigado.");
    engToPor.put("Bye", "Tchau");
  }

  public String getTranslation(Language senderLanguage, Language receiverLanague, String message) {

    if(senderLanguage.equals(receiverLanague)) {
      return message;
    }

    if(senderLanguage == Language.PORTUGUES) {
      return porToEng.get(message) != null ? porToEng.get(message) : message;
     } else {
       return engToPor.get(message) != null ? engToPor.get(message) : message;
     }
  }

}
