import model.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteraConta {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();
        Conta conta = em.find(Conta.class, 1L);
        em.getTransaction().begin();
        conta.setSaldo(50.0);
        em.getTransaction().commit();
    }
}
