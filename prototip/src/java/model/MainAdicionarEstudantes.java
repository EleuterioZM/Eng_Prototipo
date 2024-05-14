package model;

import java.util.List;

public class MainAdicionarEstudantes {

    public static void main(String[] args) {
        // Criar instância de EstudanteDAO
        EstudanteDAO estudanteDAO = new EstudanteDAO();

        // Adicionar alguns estudantes como exemplo
      //  adicionarEstudantesExemplo(estudanteDAO);

        // Listar todos os estudantes para verificar se foram adicionados corretamente
        listarTodosEstudantes(estudanteDAO);
    }

    private static void adicionarEstudantesExemplo(EstudanteDAO estudanteDAO) {
        // Estudante 1
        Estudante estudante1 = new Estudante();
        estudante1.setNrMatricula(1);
        estudante1.setNome("João");
        estudante1.setApelido("Silva");
        estudante1.setEndereco("Rua A, nº 123");
        estudante1.setContacto("9999-8888");

        // Estudante 2
        Estudante estudante2 = new Estudante();
        estudante2.setNrMatricula(2);
        estudante2.setNome("Maria");
        estudante2.setApelido("Santos");
        estudante2.setEndereco("Rua B, nº 456");
        estudante2.setContacto("7777-6666");

        // Adicionar os estudantes ao banco de dados
        estudanteDAO.adicionar(estudante1);
        estudanteDAO.adicionar(estudante2);
    }

    private static void listarTodosEstudantes(EstudanteDAO estudanteDAO) {
        List<Estudante> estudantes = estudanteDAO.listarTodos();
        if (estudantes != null) {
            System.out.println("Lista de Estudantes:");
            for (Estudante estudante : estudantes) {
                System.out.println(estudante);
            }
        } else {
            System.out.println("Erro ao listar estudantes.");
        }
    }
}
