package Controller;

import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Avaliacao;
import model.AvaliacaoDAO;

@WebServlet("/GerenciarAvaliacaoServlet")
public class GerenciarAvaliacaoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response); // Lidar tanto com solicitações POST quanto GET
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descricao = request.getParameter("descricao"); // Obter descrição do parâmetro enviado
        String idParam = request.getParameter("id"); // Obter o ID do parâmetro enviado

        // Criar uma instância de AvaliacaoDAO
        AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();
        
        // Se a descrição não estiver vazia, então é uma tentativa de adicionar uma avaliação
        if (descricao != null && !descricao.isEmpty()) {
            adicionarAvaliacao(request, response, avaliacaoDAO);
        } else if (idParam != null && !idParam.isEmpty()) { // Se o ID não estiver vazio, então é uma tentativa de buscar uma avaliação
            buscarAvaliacao(request, response, avaliacaoDAO);
        } else {
            // Se não for nenhum dos casos acima, redirecionar para a página de avaliação
            response.sendRedirect("avaliacao.jsp");
        }
    }
    
 private void adicionarAvaliacao(HttpServletRequest request, HttpServletResponse response, AvaliacaoDAO avaliacaoDAO) throws ServletException, IOException {
    try {
        // Receber os dados do formulário
        String descricao = request.getParameter("descricao");
        BigDecimal peso = new BigDecimal(request.getParameter("peso"));
         int id = new Integer(request.getParameter("AA"));
        // Criar uma nova instância de Avaliacao
        Avaliacao novaAvaliacao = new Avaliacao();
        novaAvaliacao.setDescricao(descricao);
        novaAvaliacao.setPeso(peso);
        novaAvaliacao.setId(id);

        // Adicionar a nova avaliação ao banco de dados
        avaliacaoDAO.adicionar(novaAvaliacao);

        // Redirecionar de volta para a página de avaliação
        response.sendRedirect("avaliacao.jsp");
    } catch (Exception e) {
        // Em caso de erro, imprime o stack trace
        e.printStackTrace();
        // Pode redirecionar para uma página de erro ou fazer outra coisa, conforme necessário
        response.sendRedirect("erro.jsp");
    }
}

    
    private void buscarAvaliacao(HttpServletRequest request, HttpServletResponse response, AvaliacaoDAO avaliacaoDAO) throws ServletException, IOException {
        // Receber o ID da avaliação a ser buscada
        int id = Integer.parseInt(request.getParameter("id"));

        // Buscar a avaliação por ID
        Avaliacao avaliacao = avaliacaoDAO.getById(id);

        // Exibir o resultado da busca no JSP
        request.setAttribute("avaliacao", avaliacao);
        request.getRequestDispatcher("avaliacao.jsp").forward(request, response);
    }
    public static void main(String[] args) {
        // Criar uma instância de AvaliacaoDAO
        AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();

        try {
            // Criar uma nova avaliação
            Avaliacao novaAvaliacao = new Avaliacao();
            novaAvaliacao.setDescricao("Avaliação de Teste");
            novaAvaliacao.setPeso(new BigDecimal("10.5")); // Peso como exemplo
            System.out.println(novaAvaliacao);
            // Adicionar a nova avaliação ao banco de dados
            avaliacaoDAO.adicionar(novaAvaliacao);

            System.out.println("Avaliação adicionada com sucesso!");
              System.out.println(novaAvaliacao);
        } catch (Exception e) {
            // Em caso de erro, imprime o stack trace
            e.printStackTrace();
            System.out.println("Erro ao adicionar avaliação.");
        }
    }
    }

