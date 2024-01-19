package esercizio_g5;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Archivio archivio = new Archivio();

        //creo gli oggetti libri e riviste con relative informazioni
        Libri libro = new Libri(123456, "Il signore delle mosche", 1954, 250, "William Golding", "Fantasy");
        Libri libro2 = new Libri(78948, "Il profumo", 1985, 200, "Patrick Suskind", "Thriller");
        Libri libro3 = new Libri(78444, "Dieci piccoli indiani", 1939, 160, "Agatha Christie", "Thriller");
        Libri libro4 = new Libri(55124, "Scorrete lacrime, disse il poliziotto", 1974, 210, "Philip K. Dick", "Distopian Fantasy");
        Riviste rivista = new Riviste(45678, "Time", 2000, 50, Periodo.SETTIMANALE);
        Riviste rivista2 = new Riviste(78942, "Giochi per il mio computer", 1995, 80, Periodo.MENSILE);
        Riviste rivista3 = new Riviste(9887, "Minerali DeAgostini", 1998, 78, Periodo.SEMESTRALE);
        Riviste rivista4 = new Riviste(70006, "Oggi", 2024, 45, Periodo.SETTIMANALE);

        System.out.println();

        //aggiungo gli oggetti all'archivio
        System.out.println("Elementi aggiunti all'archivio: ");
        archivio.aggiungiElemento(libro);
        archivio.aggiungiElemento(libro2);
        archivio.aggiungiElemento(libro3);
        archivio.aggiungiElemento(libro4);
        archivio.aggiungiElemento(rivista);
        archivio.aggiungiElemento(rivista2);
        archivio.aggiungiElemento(rivista3);
        archivio.aggiungiElemento(rivista4);
        archivio.getArchivio().forEach(System.out::println);
        System.out.println();

        //rimuovo gli oggetti dall'archivio
        System.out.println("Elementi rimossi dall'archivio: ");
        long removeCodiceISBN = 78942;
        archivio.rimuoviISBN(removeCodiceISBN);
        System.out.println();

        System.out.println("Archivio aggiornato: ");
        archivio.getArchivio().forEach(System.out::println);
        System.out.println();

        //l'utente cerca tramite il codice ISBN
        System.out.println("Digita il codice ISBN per eseguire una ricerca: ");
        long ricercaCodiceISBN = scanner.nextLong();
        Catalogo risultatoRicerca = archivio.ricercaISBN(ricercaCodiceISBN);

        if (risultatoRicerca != null) {
            System.out.println("Elemento trovato: " + risultatoRicerca);
        } else {
            System.out.println("Elemento inesistente nell'archivio con il codice: " + ricercaCodiceISBN);
        }
        System.out.println();

        //l'utente cerca tramite l'anno di pubblicazione
        System.out.print("Inserisci l'anno di pubblicazione per eseguire una ricerca: ");
        int ricercaAnnoPubblicazione = scanner.nextInt();
        List<Catalogo> risultatiRicerca = archivio.ricercaAnno(ricercaAnnoPubblicazione);

        if (!risultatiRicerca.isEmpty()) {
            System.out.println("Elemento trovato: ");
            for (Catalogo risultato : risultatiRicerca) {
                System.out.println(risultato);
            }
        } else {
            System.out.println("Elemento inesistente nell'archivio con l'anno: " + ricercaAnnoPubblicazione);
        }
        System.out.println();
        scanner.nextLine();

        //l'utente cerca tramite il nome dell'autore
        System.out.print("Inserisci l'autore per eseguire la ricerca: ");
        String cercaAutore = scanner.nextLine();

        List<Catalogo> risultatiRicercaAutore = archivio.ricercaAutore(cercaAutore);

        if (!risultatiRicerca.isEmpty()) {
            System.out.println("Elemento trovato: ");
            for (Catalogo risultato : risultatiRicercaAutore) {
                System.out.println(risultato);
            }
        } else {
            System.out.println("Elemento inesistente nell'archivio con il nome: " + cercaAutore);
        }
        scanner.close();
    }
}
