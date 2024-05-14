package model;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class EstudanteDAO {

    public void salvarOuAtualizar(Estudante estudante) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(estudante);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Estudante buscarPorNrMatricula(int nrMatricula) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return (Estudante) session.get(Estudante.class, nrMatricula);
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void adicionar(Estudante estudante) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(estudante);
            transaction.commit();
            System.out.println("Estudante adicionado com sucesso!");
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void excluir(Estudante estudante) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(estudante);
            transaction.commit();
            System.out.println("Estudante excluído com sucesso!");
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
  public static List<Estudante> listarTodos() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT e FROM Estudante e LEFT JOIN FETCH e.realizas");
        return query.list();
    } catch (HibernateException e) {
        e.printStackTrace();
        return null;
    }}
      public static void main(String[] args) {
          System.out.println(listarTodos());

    }
      
}
