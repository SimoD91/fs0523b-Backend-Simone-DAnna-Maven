package esercizio_w3_g2;

import esercizio_w3_g2.dao.EventoDAO;
import esercizio_w3_g2.entities.Evento;
import esercizio_w3_g2.entities.tipoEvento;

import java.time.LocalDate;

public class UsaEventoDAO {
    public static void main(String[] args) {
        EventoDAO dao = new EventoDAO();
        Evento e = new Evento();
        e.setTitolo("Concerto punk rock");
        e.setTipoEvento(tipoEvento.PUBBLICO);
        e.setNumeroPartecipanti(2000);
        e.setDataEvento(LocalDate.of(2024,07,12));

        Evento e2 = new Evento();
        e2.setTitolo("Mostra cinematografica");
        e2.setTipoEvento(tipoEvento.PRIVATO);
        e2.setNumeroPartecipanti(500);
        e2.setDataEvento(LocalDate.of(2024,12,19));

        dao.mostraEvento(e);
        System.out.println(e);
        dao.mostraEvento(e2);
        System.out.println(e2);

        dao.cancellaEvento(8);
        dao.cancellaEvento(7);


        Evento e3 = dao.getById(1);
        System.out.println(e3);

    }
}
