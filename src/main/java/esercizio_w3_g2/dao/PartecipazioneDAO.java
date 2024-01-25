package esercizio_w3_g2.dao;

import esercizio_w3_g2.entities.Evento;
import esercizio_w3_g2.entities.Partecipazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PartecipazioneDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PartecipazioneDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }
    public Partecipazione mostraPartecipazione(Partecipazione e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();

        em.refresh(e);

        return e;
    }
    public Partecipazione getById(int id){
        return em.find(Partecipazione.class, id);
    }
    public void cancellaPartecipazione(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();

        Partecipazione e = getById(id);
        em.remove(e);

        et.commit();

    }

}
