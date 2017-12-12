package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroProveedores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>RegistroProveedores</title>\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>Registro de Proveedores</h1>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                    <form action=\"controladorProveedores\" method=\"post\">\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Nombre</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txt_nombre\" id=\"txt_nombre\" placeholder=\"Ingrese Nombre\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">RUC</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"ruc\" id=\"ruc\" placeholder=\"Ingrese RUC\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Dirección</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txt_direccion\" id=\"txt_direccion\" placeholder=\"Ingrese Direccion\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Teléfono</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"telefono\" id=\"telefono\" placeholder=\"Ingrese Telefono\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Email</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Ingrese email\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Ciudad</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txt_ciudad\" id=\"txt_ciudad\" placeholder=\"Ingrese Ciudad\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">Sitio-web</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txt_web\" id=\"txt_web\" placeholder=\"Ingrese Sitio-Web\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\"> \n");
      out.write("                            <!-- Button -->                                        \n");
      out.write("                            <div class=\"form-group text-center\">\n");
      out.write("                               \n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">REGISTRAR</button>\n");
      out.write("                            </div><br>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div style=\"border-top: 1px solid #999; padding-top:20px\"  class=\"form-group\"></div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
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
