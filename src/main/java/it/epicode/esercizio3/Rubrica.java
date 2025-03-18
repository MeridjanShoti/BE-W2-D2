package it.epicode.esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private final Map<String, String> rubrica = new HashMap<>();

    public void aggiungiContatto(String nome, String numero) {
        rubrica.put(nome, numero);
    }
    public void rimuoviContatto(String nome) {
        rubrica.remove(nome);
    }
    public void cercaPersonaDaNumero(String numero) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
