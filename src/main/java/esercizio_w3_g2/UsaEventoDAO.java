package esercizio_w3_g2;

import esercizio_w3_g2.dao.EventoDAO;
import esercizio_w3_g2.dao.LocationDAO;
import esercizio_w3_g2.dao.PartecipazioneDAO;
import esercizio_w3_g2.dao.PersonaDAO;
import esercizio_w3_g2.entities.*;

import java.time.LocalDate;

public class UsaEventoDAO {
    public static void main(String[] args) {
        EventoDAO dao = new EventoDAO();
        Evento e = new Evento();
        EventoDAO eventoDAO = new EventoDAO();
        LocationDAO locationDAO = new LocationDAO();
        PersonaDAO personaDAO = new PersonaDAO();
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();

        e.setTitolo("Concerto punk rock");
        e.setTipoEvento(tipoEvento.PUBBLICO);
        e.setNumeroPartecipanti(2000);
        e.setDataEvento(LocalDate.of(2024,07,12));

        Evento e2 = new Evento();
        e2.setTitolo("Mostra cinematografica");
        e2.setTipoEvento(tipoEvento.PRIVATO);
        e2.setNumeroPartecipanti(500);
        e2.setDataEvento(LocalDate.of(2024,12,19));

        Persona p1 = new Persona();
        p1.setNome("Carlo");
        p1.setCognome("Re");
        p1.setDataDiNascita(LocalDate.of(2000,01,02));

        Persona p2 = new Persona();
        p2.setNome("Paolo");
        p2.setCognome("Bianchi");
        p2.setDataDiNascita(LocalDate.of(2000,01,02));

        personaDAO.mostraPersona(p1);
        personaDAO.mostraPersona(p2);

        Location location = new Location();
        location.setCitta("Roma");

        locationDAO.mostraEvento(location);

        Evento ev1 = new Evento();
        ev1.setTitolo("concerto");
        ev1.setLocation(location);

        Evento ev2 = new Evento();
        ev2.setTitolo("corse-a");
        ev2.setLocation(location);

        eventoDAO.mostraEvento(ev1);
        eventoDAO.mostraEvento(ev2);

        Partecipazione pa1 = new Partecipazione();
        pa1.setPersona(p1);
        pa1.setEvento(ev1);

        Partecipazione pa2 = new Partecipazione();
        pa2.setPersona(p1);
        pa2.setEvento(ev2);

        Partecipazione pa3 = new Partecipazione();
        pa3.setPersona(p2);
        pa3.setEvento(ev2);

        partecipazioneDAO.mostraPartecipazione(pa1);
        partecipazioneDAO.mostraPartecipazione(pa2);
        partecipazioneDAO.mostraPartecipazione(pa3);

        dao.mostraEvento(e);
        System.out.println(e);
        dao.mostraEvento(e2);
        System.out.println(e2);

        Evento e3 = dao.getById(1);
        System.out.println(e3);

    }
}
