package esercizio_w3_g2.entities;

import javax.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "persona_fk")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "evento_fk")
    private Evento evento;
    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione() {
    }

    public Partecipazione(int id, Persona persona, Evento evento, Stato stato) {
        this.id = id;
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
