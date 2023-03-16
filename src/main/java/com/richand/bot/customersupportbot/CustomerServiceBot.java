package com.richand.bot.customersupportbot;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerServiceBot {
    private Map<String, String> faq;

    public CustomerServiceBot() {
        faq = new HashMap<>();
        faq.put("¿Cuál es el horario de atención?", "Nuestro horario de atención es de lunes a viernes de 9 a 18 hs.");
        faq.put("¿Cómo puedo contactarlos?", "Puedes contactarnos a través de nuestro formulario de contacto en nuestro sitio web.");
        faq.put("¿Cuáles son sus precios?", "Nuestros precios varían dependiendo del producto. Puedes encontrar más información en nuestro sitio web.");
    }

    public String getAnswer(String question) {
        return faq.entrySet().stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(question))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse("Lo siento, no puedo responder esa pregunta en este momento.");
    }
}