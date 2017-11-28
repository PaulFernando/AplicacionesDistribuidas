package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <div id=\"signupbox\" style=\"display:none; margin-top:50px\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">\n");
      out.write("            <div class=\"panel panel-info\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <div class=\"panel-title\">Sign Up</div>\n");
      out.write("                    <div style=\"float:right; font-size: 85%; position: relative; top:-10px\"><a id=\"signinlink\" href=\"#\" onclick=\"$('#signupbox').hide(); $('#loginbox').show()\">Sign In</a></div>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"panel-body\" >\n");
      out.write("                    <form id=\"signupform\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("\n");
      out.write("                        <div id=\"signupalert\" style=\"display:none\" class=\"alert alert-danger\">\n");
      out.write("                            <p>Error:</p>\n");
      out.write("                            <span></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email\" class=\"col-md-3 control-label\">Email</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Email Address\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"firstname\" class=\"col-md-3 control-label\">First Name</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"firstname\" placeholder=\"First Name\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"lastname\" class=\"col-md-3 control-label\">Last Name</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"lastname\" placeholder=\"Last Name\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password\" class=\"col-md-3 control-label\">Password</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"passwd\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"icode\" class=\"col-md-3 control-label\">Invitation Code</label>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"icode\" placeholder=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <!-- Button -->                                        \n");
      out.write("                            <div class=\"col-md-offset-3 col-md-9\">\n");
      out.write("                                <button id=\"btn-signup\" type=\"button\" class=\"btn btn-info\"><i class=\"icon-hand-right\"></i> &nbsp Sign Up</button>\n");
      out.write("                                <span style=\"margin-left:8px;\">or</span>  \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div style=\"border-top: 1px solid #999; padding-top:20px\"  class=\"form-group\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-offset-3 col-md-9\">\n");
      out.write("                                <button id=\"btn-fbsignup\" type=\"button\" class=\"btn btn-primary\"><i class=\"icon-facebook\"></i>   Sign Up with Facebook</button>\n");
      out.write("                            </div>                                           \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
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
