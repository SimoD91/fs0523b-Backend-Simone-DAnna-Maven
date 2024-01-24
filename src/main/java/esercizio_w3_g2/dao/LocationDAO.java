package esercizio_w3_g2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LocationDAO {
        private EntityManagerFactory emf;
        private EntityManager em;

        public LocationDAO(){
            emf = Persistence.createEntityManagerFactory("gestioneeventi");
            em = emf.createEntityManager();
        }
}
