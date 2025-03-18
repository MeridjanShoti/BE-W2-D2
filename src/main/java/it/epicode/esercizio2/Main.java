package it.epicode.esercizio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNumeri = ListaNumeri.listaNumeri();
        List<Integer> listaAvantiIndietro = ListaNumeri.listaAvantiIndietro(listaNumeri);
        System.out.println("Lista numeri: " + listaNumeri);
        System.out.println("Lista avanti e indietro: " + listaAvantiIndietro);
        System.out.println("lista pari: " + ListaNumeri.pariDispari(listaNumeri, true));
        System.out.println("lista dispari: " + ListaNumeri.pariDispari(listaNumeri, false));
    }
}
