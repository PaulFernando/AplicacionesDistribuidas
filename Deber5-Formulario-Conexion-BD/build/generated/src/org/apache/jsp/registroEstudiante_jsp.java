package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroEstudiante_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write("        <title>registroEstudiantes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registro Estudiantes</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <form action=\"ControladorEstudiante\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Nombre del Estudiante</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txt_nombre\" placeholder=\"Enter nombre\" name=\"txt_nombre\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Apellido del Estudiante</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txt_apellido\" placeholder=\"Enter apellido\" name=\"txt_apellido\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Codigo del Estudiante</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txt_codigo\" placeholder=\"Enter codigo\" name=\"txt_codigo\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Email address</label>\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" id=\"txt_email\" placeholder=\"Enter email\" name=\"txt_email\" required>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Telefono:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"txt_telefono\" placeholder=\"Enter telefono\" name=\"txt_telefono\" required>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Genero:</label>\n");
      out.write("                            <select class=\"form-control\" id=\"txt_genero\" name=\"txt_genero\" required>                               \n");
      out.write("                                <option>Masculino</option>\n");
      out.write("                                <option>Femenino</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Seleccionar Foto:</label>\n");
      out.write("                            <input type=\"file\" class=\"form-control-file\" id=\"txt_file\" name=\"txt_file\" required>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                            <label class=\"form-check-label\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"txt_estudia\" name=\"txt_estudia\" required>\n");
      out.write("                                Estudia Actualmente\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Guardar Datos</button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
