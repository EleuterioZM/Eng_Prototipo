<%@page import="java.util.List"%>
<%@page import="model.EstudanteDAO"%>
<%@page import="model.Estudante"%>
<%@page import="java.util.Set"%>
<%@page import="model.Realiza"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Estudantes</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        .realizacoes {
            list-style-type: none;
            padding: 0;
        }
        .realizacao {
            margin-bottom: 8px;
        }
    </style>
</head>
<body>
    <h1>Lista de Estudantes</h1>
    <table>
        <thead>
            <tr>
                <th>Matrícula</th>
                <th>Nome</th>
                <th>Curso</th>
                <th>Turma</th>
                <th>Realizações</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<Estudante> estudantes = EstudanteDAO.listarTodos();
                for (Estudante estudante : estudantes) {
            %>
            <tr>
                <td><%= estudante.getNrMatricula() %></td>
                <td><%= estudante.getNome() %></td>
                <td><%= estudante.getCurso() != null ? estudante.getCurso().getNome() : "N/A" %></td>
                <td><%= estudante.getTurma() != null ? estudante.getTurma().getDescricao() : "N/A" %></td>
                <td>
                    <ul class="realizacoes">
                        <% 
                            Set<Realiza> realizas = estudante.getRealizas();
                            if (realizas != null && !realizas.isEmpty()) {
                                for (Realiza realiza : realizas) {
                        %>
                        <li class="realizacao">
                            <strong>Avaliação:</strong> <%= realiza.getAvaliacao().getDescricao() %><br>
                            <strong>Nota:</strong> <%= realiza.getNota() %>
                        </li>
                        <% 
                                }
                            } else {
                        %>
                        <li>Nenhuma realização</li>
                        <% } %>
                    </ul>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
