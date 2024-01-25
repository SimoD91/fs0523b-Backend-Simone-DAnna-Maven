package esercizio_w3_g2.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titolo;
    @Column(name = "data_evento",nullable = false)
    private LocalDate dataEvento;

    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;
    @Column(name = "numero_partecipanti", nullable = false)
    private int NumeroPartecipanti;

    @ManyToOne
    @JoinColumn(name = "location_fk")
    private Location location;

    @OneToMany(mappedBy = "evento")
    private List<Partecipazione> partecipazioni;

    public Evento() {
    }

    public Evento(int id, String titolo, LocalDate dataEvento, esercizio_w3_g2.entities.tipoEvento tipoEvento, int numeroPartecipanti, Location location, List<Partecipazione> partecipazioni ) {
        this.id = id;
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.tipoEvento = tipoEvento;
        NumeroPartecipanti = numeroPartecipanti;
        this.location = location;
        this.partecipazioni = partecipazioni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public esercizio_w3_g2.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(esercizio_w3_g2.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroPartecipanti() {
        return NumeroPartecipanti;
    }

    public void setNumeroPartecipanti(int numeroPartecipanti) {
        NumeroPartecipanti = numeroPartecipanti;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", tipoEvento=" + tipoEvento +
                ", NumeroPartecipanti=" + NumeroPartecipanti +
                ", location=" + location +
                ", partecipazioni=" + partecipazioni +
                '}';
    }


}
