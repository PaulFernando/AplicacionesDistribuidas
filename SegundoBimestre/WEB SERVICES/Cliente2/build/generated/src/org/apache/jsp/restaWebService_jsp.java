package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class restaWebService_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String num1;
            String num2;
        
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
      out.write("        <title>resta</title>\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Resta:</h1>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <form action=\"restaWebService.jsp\" method=\"post\">\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">1er Numero</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txt_num1\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-md-3 control-label\">2do Numero</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txt_num2\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <!-- Button -->                                        \n");
      out.write("                            <div class=\"form-group text-center\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-info\"> &nbsp Enviar Datos</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    ");
 num1 = request.getParameter("txt_num1"); 
      out.write("\n");
      out.write("\n");
      out.write("                    ");
 num2 = request.getParameter("txt_num2"); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

        try {
            servicio.ServicioResta_Service service = new servicio.ServicioResta_Service();
            servicio.ServicioResta port = service.getServicioRestaPort();
            // TODO initialize WS operation arguments here
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            // TODO process result here
            java.lang.Double result = port.resta(a, b);
            out.println("Resultado = " + result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
