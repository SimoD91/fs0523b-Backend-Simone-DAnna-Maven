package esercizio_w3_g2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String citta;

    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;

    public Location() {
    }

    public Location(int id, String nome, String citta, List<Evento> eventi) {
        this.id = id;
        this.nome = nome;
        this.citta = citta;
        this.eventi = eventi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public List<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}
