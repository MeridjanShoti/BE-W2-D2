package it.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeri {
    Logger logger = LoggerFactory.getLogger(ListaNumeri.class);
    public static List<Integer> listaNumeri() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("inserisci un numero");
        int numElementi = scanner.nextInt();
        for (int i = 0; i < numElementi; i++) {
            list.add((int) (Math.random()*100));
        }
        list.sort(Integer::compareTo);
        return list;
    }
    public static List<Integer> listaAvantiIndietro(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list.reversed());
        return list2;
    }
    public static List<Integer> pariDispari(List<Integer> list, boolean pari) {
        List<Integer> list2 = new ArrayList<>();
        for (Integer num : list) {
            if (pari) {
                if (num % 2 == 0) {
                    list2.add(num);
                }
            } else {
                if (num % 2 != 0) {
                    list2.add(num);
                }
            }
        }
        return list2;

    }
}
