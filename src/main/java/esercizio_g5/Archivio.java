package esercizio_g5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Archivio {
    private List<Catalogo> archivio = new ArrayList<>();

    //metodo per aggiungere elemento dall'archivio
    public void aggiungiElemento(Catalogo elemento) {
        archivio.add(elemento);
    }

    //metodo per rimuovere elemento dall'archivio
    public void rimuoviISBN(long codiceISBM) {
        Iterator<Catalogo> iterator = archivio.iterator();
        while (iterator.hasNext()) {
            Catalogo elemento = iterator.next();
            if (elemento.getCodiceISBM() == codiceISBM) {
                iterator.remove();
                System.out.println("Elemento " + codiceISBM + " rimosso.");
                return;
            }
        }
    }

    public List<Catalogo> getArchivio() {
        return archivio;
    }

    //metodo per cercare tramite codice ISBM
    public Catalogo ricercaISBN(long codiceISBM) {
        for (Catalogo elemento : archivio) {
            if (elemento.getCodiceISBM() == codiceISBM) {
                return elemento;
            }
        }
        return null;
    }
    //metodo per cercare tramite l'anno di pubblicazione
    public List<Catalogo> ricercaAnno(int annoPubblicazione) {
        List<Catalogo> risultati = new ArrayList<>();
        for (Catalogo elemento : archivio) {
            if (elemento.getAnnoPubblicazione() == annoPubblicazione) {
                risultati.add(elemento);
            }
        }
        return risultati;
    }
    //metodo per cercare tramite il nome dell'autore
    public List<Catalogo> ricercaAutore(String autore) {
        List<Catalogo> risultati = new ArrayList<>();
        for (Catalogo elemento : archivio) {
            if (elemento instanceof Libri && ((Libri) elemento).getAutore().equalsIgnoreCase(autore)) {
                risultati.add(elemento);
            }
        }
        return risultati;
    }
}