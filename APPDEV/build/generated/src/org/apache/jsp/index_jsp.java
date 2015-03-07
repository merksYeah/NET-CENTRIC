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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>DLSUbeacon| Login</title>\n");
      out.write("\t\t<meta name=\"generator\" content=\"Bootply\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link href=\"css/styles_login.css\" rel=\"stylesheet\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("<!--login modal-->\n");
      out.write("<div id=\"loginModal\" class=\"modal show\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\" style=\"text-align: center;\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("          <img src=\"css/logo.png\" style=\"width: 35%; height: 35%;\" />\n");
      out.write("          <h1 class=\"text-center\"><b style=\"color: black;\">Log in</b></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form class=\"form col-md-12 center-block\" action=\"Login\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control input-lg\" id=\"text\" placeholder=\"Email\" name=\"username\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"password\" class=\"form-control input-lg\" id=\"text\" placeholder=\"Password\" name=\"password\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <button class=\"btn btn-primary btn-lg btn-block\" style=\"background-color: #026f27; border-color: #026f27; \n");
      out.write("              border-bottom-color: #003000;\">Sign in</button>\n");
      out.write("              <span class=\"pull-right\"><a href=\"ToRegister\">Register</a></span><span><a href=\"#\">Need help?</a></span>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("\t\t  </div>\t\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\t<!-- script references -->\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("</html>");
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
