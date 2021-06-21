import model.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaConta {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta();
        conta.setTitular("Ricco");
        conta.setAgencia(123);
        conta.setNumero(123);

        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();
    }
}
