package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("            \n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/lightbox.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("    </head>\n");
      out.write("    <body data-spy=\"scroll\" data-target=\".navbar-nav\">\n");
      out.write("    \n");
      out.write("     <!-- Preloader -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <div class=\"spinner\">\n");
      out.write("            <div class=\"cube1\"></div>\n");
      out.write("            <div class=\"cube2\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- // Preloader -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- ====== Header ====== -->\n");
      out.write("    <header id=\"header\" class=\"header\">\n");
      out.write("        <!-- ====== Navbar ====== -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <a class=\"navbar-brand logo\" href=\"index.html\">\n");
      out.write("                    <img src=\"assets/images/logo.png\" alt=\"logo\">\n");
      out.write("                </a>\n");
      out.write("                <!-- // Logo -->\n");
      out.write("\n");
      out.write("                <!-- Mobile Menu -->\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-expanded=\"false\"><span><i class=\"fa fa-bars\"></i></span></button>\n");
      out.write("                <!-- Mobile Menu -->\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse main-menu\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item active\"><a class=\"nav-link\" href=\"#home\">HOME</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#about\">ABOUT</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#service\">SERVICE</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#portfolio\">PORTFOLIO</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"blog.html\">BLOG</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link pr0\" href=\"#contact\">CONTACT</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- ====== // Navbar ====== -->\n");
      out.write("    </header>\n");
      out.write("    <!-- ====== // Header ====== -->\n");
      out.write("\n");
      out.write("    <!-- ====== Hero Area ====== -->\n");
      out.write("    <div class=\"hero-aria\" id=\"home\">\n");
      out.write("        <!-- Hero Area Content -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"hero-content h-100\">\n");
      out.write("                <div class=\"d-table\">\n");
      out.write("                    <div class=\"d-table-cell\">\n");
      out.write("                        <h2 class=\"text-uppercase\">Portal ISCIM</h2>\n");
      out.write("                        <h3 class=\"text-uppercase\"><span></span></h3>\n");
      out.write("                        <p>Make designed by as Begindot.</p>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                        <a href=\"#about\" class=\"button smooth-scroll\">Learn More</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- // Hero Area Content -->\n");
      out.write("        <!-- Hero Area Slider -->\n");
      out.write("        <div class=\"hero-area-slids owl-carousel\">\n");
      out.write("            <div class=\"single-slider\">\n");
      out.write("                <!-- Single Background -->\n");
      out.write("                <div class=\"slider-bg\" style=\"background-image: url(assets/images/hero-area/img-1.jpg)\"></div>\n");
      out.write("                <!-- // Single Background -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"single-slider\">\n");
      out.write("                <!-- Single Background -->\n");
      out.write("                <div class=\"slider-bg\" style=\"background-image: url(assets/images/hero-area/img-2.jpg)\"></div>\n");
      out.write("                <!-- // Single Background -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- // Hero Area Slider -->\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ====== Footer Area ====== -->\n");
      out.write("    <footer class=\"footer-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <div class=\"copyright-text\">\n");
      out.write("                        <p class=\"text-white\"> &copy; 2018</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- ====== // Footer Area ====== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <!-- ====== ALL JS ====== -->\n");
      out.write("   <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lightbox.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.mixitup.js\"></script>\n");
      out.write("    <script src=\"assets/js/wow.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/typed.js\"></script>\n");
      out.write("    <script src=\"assets/js/skill.bar.js\"></script>\n");
      out.write("    <script src=\"assets/js/fact.counter.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
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
