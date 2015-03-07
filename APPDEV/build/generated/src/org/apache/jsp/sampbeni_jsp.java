package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sampbeni_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html\">\n");
      out.write("  <title>DLSUbeacon</title>\n");
      out.write("  <link rel=\"shortcut icon\" href=\"http://static.tmimgcdn.com/img/favicon.ico\">\n");
      out.write("  <link rel=\"icon\" href=\"http://static.tmimgcdn.com/img/favicon.ico\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"register/css/styles.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"register/css/switchery.min.css\">\n");
      out.write("  <script type=\"text/javascript\" src=\"register/js/switchery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("  \n");
      out.write("  <h1>Registration Form</h1>\n");
      out.write("  \n");
      out.write("  <form method=\"post\" action =\"AddItem\">\n");
      out.write("  <div class=\"col-2\">\n");
      out.write("    <label>\n");
      out.write("      ID Number:\n");
      out.write("      <input name =\"item_type\" placeholder=\"one letter\" id=\"name\" tabindex=\"1\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-2\">\n");
      out.write("    <label>\n");
      out.write("      Name:\n");
      out.write("      <input name = \"status\" placeholder=\"First Name, Last Name\" id=\"company\" tabindex=\"2\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-3\">\n");
      out.write("    <label>\n");
      out.write("      Username:\n");
      out.write("      <input placeholder=\"max. of 32 characters\" id=\"company\" name=\"description\" tabindex=\"2\">\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"col-submit\">\n");
      out.write("    <button type=\"submit\" class=\"submitbtn\">Submit Form</button>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  </form>\n");
      out.write("  </div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));\n");
      out.write("\n");
      out.write("elems.forEach(function(html) {\n");
      out.write("  var switchery = new Switchery(html);\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
