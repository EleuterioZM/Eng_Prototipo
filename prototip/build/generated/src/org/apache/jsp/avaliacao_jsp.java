package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Avaliacao;

public final class avaliacao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Gerenciamento de Avaliações</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Gerenciamento de Avaliações</h1>\n");
      out.write("    \n");
      out.write("    <!-- Formulário para adicionar uma nova avaliação -->\n");
      out.write("    <h2>Adicionar Avaliação</h2>\n");
      out.write("    <form action=\"GerenciarAvaliacaoServlet\" method=\"post\">\n");
      out.write("         id: <input type=\"text\" name=\"id1\"><br>\n");
      out.write("       \n");
      out.write("        <input type=\"hidden\" name=\"acao\" value=\"adicionar\"> <!-- Campo oculto para indicar a ação -->\n");
      out.write("        Descrição: <input type=\"text\" name=\"descricao\"><br>\n");
      out.write("        Peso: <input type=\"text\" name=\"peso\"><br>\n");
      out.write("        <input type=\"submit\" value=\"Adicionar Avaliação\">\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <!-- Formulário para buscar uma avaliação por ID -->\n");
      out.write("    <h2>Buscar Avaliação</h2>\n");
      out.write("    <form action=\"GerenciarAvaliacaoServlet\" method=\"get\">\n");
      out.write("        <input type=\"hidden\" name=\"acao\" value=\"buscar\"> <!-- Campo oculto para indicar a ação -->\n");
      out.write("        ID da Avaliação: <input type=\"text\" name=\"id\"><br>\n");
      out.write("        <input type=\"submit\" value=\"Buscar Avaliação\">\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <!-- Campo para exibir o resultado da busca -->\n");
      out.write("    <h2>Resultado da Busca</h2>\n");
      out.write("    <div id=\"resultado\">\n");
      out.write("        ");

            Avaliacao avaliacao = (Avaliacao) request.getAttribute("avaliacao");
            if (avaliacao != null) {
        
      out.write("\n");
      out.write("        <p>ID: ");
      out.print( avaliacao.getId() );
      out.write("</p>\n");
      out.write("        <p>Descrição: ");
      out.print( avaliacao.getDescricao() );
      out.write("</p>\n");
      out.write("        <p>Peso: ");
      out.print( avaliacao.getPeso() );
      out.write("</p>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        <p>Nenhuma avaliação encontrada.</p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
