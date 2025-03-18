package it.epicode.esercizio1;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void printDuplicate(Set<String> set) {
        log.info("Elenco parole duplicate:");
        for (String parola : set) {
            log.info(parola);
        }
    }
    public static void printNumberOfDistinte(Set<String> set) {
        log.info("Numero di parole distinte: " + set.size());
    }
    public static void printElencoDistinte(Set<String> set) {
        log.info("Elenco parole distinte:");
        for (String parola : set) {
            log.info(parola);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        log.info("inserisci un numero");
        int numElementi = scanner.nextInt();
        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();
        for (int i = 0; i < numElementi; i++) {
            log.info("inserisci una parola");
            String parola = scanner.next();
            if (paroleDistinte.contains(parola)) {
            paroleDuplicate.add(parola);
            } else {
                paroleDistinte.add(parola);
            }

        }
        printDuplicate(paroleDuplicate);
        printNumberOfDistinte(paroleDistinte);
        printElencoDistinte(paroleDistinte);
    }
}
