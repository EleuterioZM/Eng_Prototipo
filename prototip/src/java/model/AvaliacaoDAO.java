package model;

import java.math.BigDecimal;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class AvaliacaoDAO {

    public void salvarOuAtualizar(Avaliacao avaliacao) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(avaliacao);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Avaliacao getById(int id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return (Avaliacao) session.get(Avaliacao.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public void adicionar(Avaliacao avaliacao) {
    Transaction transaction = null;
    Session session = null;
    try {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();

        // Tentativa de salvar a avaliação
        session.save(avaliacao);

        // Commitar a transação
        transaction.commit();
        
        System.out.println("Avaliação adicionada com sucesso!");
    } catch (Exception e) {
        // Se houver erro, faz o rollback da transação
        if (transaction != null) {
            transaction.rollback();
        }
        // Imprime o stack trace do erro
        e.printStackTrace();
    } finally {
        // Fecha a sessão
        if (session != null) {
            session.close();
        }
    }
}

    public void excluir(Avaliacao avaliacao) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(avaliacao);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // Criar instância de AvaliacaoDAO
        AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();

        // Adicionar algumas avaliações como exemplo
        adicionarAvaliacoesExemplo(avaliacaoDAO);
    }

    private static void adicionarAvaliacoesExemplo(AvaliacaoDAO avaliacaoDAO) {
        // Avaliação 1
        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setDescricao("Avaliação de Matemática");
        avaliacao1.setPeso(new BigDecimal("0.2")); // Peso como exemplo
        avaliacao1.setId(4);

        // Avaliação 2
        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setDescricao("Avaliação de História");
        avaliacao2.setPeso(new BigDecimal("0.3")); // Peso como exemplo

        // Avaliação 3
        Avaliacao avaliacao3 = new Avaliacao();
        avaliacao3.setDescricao("Avaliação de Ciências");
        avaliacao3.setPeso(new BigDecimal("0.25")); // Peso como exemplo

        // Avaliação 4
        Avaliacao avaliacao4 = new Avaliacao();
        avaliacao4.setDescricao("Avaliação de Geografia");
        avaliacao4.setPeso(new BigDecimal("0.25")); // Peso como exemplo

        // Adicionar as avaliações ao banco de dados
        avaliacaoDAO.adicionar(avaliacao1);
       
        System.out.println("Avaliações adicionadas com sucesso!");
    }
}



