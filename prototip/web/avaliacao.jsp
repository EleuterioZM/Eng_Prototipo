<%@page import="model.Avaliacao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gerenciamento de Avaliações</title>
</head>
<body>
    <h1>Gerenciamento de Avaliações</h1>
    
    <!-- Formulário para adicionar uma nova avaliação -->
    <h2>Adicionar Avaliação</h2>
    <form action="GerenciarAvaliacaoServlet" method="post">
     
       
        <input type="hidden" name="acao" value="adicionar"> <!-- Campo oculto para indicar a ação -->
            id: <input type="text" name="AA"><br>
        Descrição: <input type="text" name="descricao"><br>
        Peso: <input type="text" name="peso"><br>
        <input type="submit" value="Adicionar Avaliação">
    </form>
    
    <!-- Formulário para buscar uma avaliação por ID -->
    <h2>Buscar Avaliação</h2>
    <form action="GerenciarAvaliacaoServlet" method="get">
        <input type="hidden" name="acao" value="buscar"> <!-- Campo oculto para indicar a ação -->
        ID da Avaliação: <input type="text" name="id"><br>
        <input type="submit" value="Buscar Avaliação">
    </form>
    
    <!-- Campo para exibir o resultado da busca -->
    <h2>Resultado da Busca</h2>
    <div id="resultado">
        <%
            Avaliacao avaliacao = (Avaliacao) request.getAttribute("avaliacao");
            if (avaliacao != null) {
        %>
        <p>ID: <%= avaliacao.getId() %></p>
        <p>Descrição: <%= avaliacao.getDescricao() %></p>
        <p>Peso: <%= avaliacao.getPeso() %></p>
        <% } else { %>
        <p>Nenhuma avaliação encontrada.</p>
        <% } %>
    </div>
</body>
</html>
