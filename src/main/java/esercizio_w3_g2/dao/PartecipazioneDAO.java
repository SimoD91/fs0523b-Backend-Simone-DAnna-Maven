package esercizio_w3_g2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PartecipazioneDAO {
        private EntityManagerFactory emf;
        private EntityManager em;

        public PartecipazioneDAO(){
            emf = Persistence.createEntityManagerFactory("gestioneeventi");
            em = emf.createEntityManager();
        }
}
