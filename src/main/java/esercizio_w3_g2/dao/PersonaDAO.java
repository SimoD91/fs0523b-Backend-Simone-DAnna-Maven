package esercizio_w3_g2.dao;

import esercizio_w3_g2.entities.Evento;
import esercizio_w3_g2.entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }
    public Persona mostraPersona(Persona e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();

        em.refresh(e);

        return e;
    }
    public Persona getById(int id){
        return em.find(Persona.class, id);
    }
    public void cancellaPersona(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();

        Persona e = getById(id);
        em.remove(e);

        et.commit();

    }

}
