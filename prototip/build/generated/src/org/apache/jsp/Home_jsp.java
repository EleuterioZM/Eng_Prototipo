package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.EstudanteDAO;
import model.Estudante;
import java.util.Set;
import model.Realiza;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Lista de Estudantes</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Lista de Estudantes</h1>\n");
      out.write("    <table>\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Matrícula</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Curso</th>\n");
      out.write("                <th>Turma</th>\n");
      out.write("                <th>Realizações</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");
 
                List<Estudante> estudantes = EstudanteDAO.listarTodos();
                for (Estudante estudante : estudantes) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( estudante.getNrMatricula() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( estudante.getNome() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( estudante.getCurso() != null ? estudante.getCurso().getNome() : "N/A" );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( estudante.getTurma() != null ? estudante.getTurma().getDescricao() : "N/A" );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <ul>\n");
      out.write("                        ");
 
                            Set<Realiza> realizas = estudante.getRealizas();
                            if (realizas != null && !realizas.isEmpty()) {
                                for (Realiza realiza : realizas) {
                        
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            Avaliação: ");
      out.print( realiza.getAvaliacao().getDescricao() );
      out.write("<br>\n");
      out.write("                            Nota: ");
      out.print( realiza.getNota() );
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        ");
 
                                }
                            } else {
                        
      out.write("\n");
      out.write("                        <li>Nenhuma realização</li>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
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
