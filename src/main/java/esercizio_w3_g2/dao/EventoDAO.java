package esercizio_w3_g2.dao;

import esercizio_w3_g2.entities.Evento;

import javax.persistence.*;

public class EventoDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }
    public Evento mostraEvento(Evento e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();

        em.refresh(e);

        return e;
    }
    public Evento getById(int id){
        return em.find(Evento.class, id);
    }
    public void cancellaEvento(int id){
     EntityTransaction et = em.getTransaction();
     et.begin();

     Evento e = getById(id);
     em.remove(e);

     et.commit();

    }

}

