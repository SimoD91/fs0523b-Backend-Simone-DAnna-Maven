package esercizio_w3_g2.dao;

import esercizio_w3_g2.entities.Evento;
import esercizio_w3_g2.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LocationDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public LocationDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }
    public Location mostraEvento(Location e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();

        em.refresh(e);

        return e;
    }
    public Location getById(int id){
        return em.find(Location.class, id);
    }
    public void cancellaLocation(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();

        Location e = getById(id);
        em.remove(e);

        et.commit();

    }

}
