/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2019-08-12 04:59:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Desktop/BBS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/k_board/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1558194525639L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Desktop/BBS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/k_board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>게시물 목록</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- <form>태그는 데이터를 전송하기 위한 HTML엘리먼트 -->\n");
      out.write("\n");
      out.write("\t<!-- get은 기존 데이터를 가져와서 우리들에게 보여주는 역할이고\n");
      out.write("\t\tpost는 우리들이 새로운 데이터를 생성해 보내거나, 기존 데이터를 수정해서 보내는겁니다 -->\n");
      out.write("\t\t\n");
      out.write("\t<form method=\"post\">\n");
      out.write("\t\n");
      out.write("\t<!-- <input>태그는 한줄로 이루어진 텍스트를 다루고 -->\n");
      out.write("\t\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- <input>태그의 type속성은 현재 작성되는 텍스트의 타입을 설정합니다. \n");
      out.write("\t\t일반 텍스트(text), 비밀번호처럼 보안이 필요한 경우 내용을 숨길 수 있는 패스워드(password), \n");
      out.write("\t\t숫자만 입력할 수 있는 넘버(number)등이 있습니다. -->\n");
      out.write("\t\t\n");
      out.write("\t\t\t<label>제목</label> <input type=\"text\" name=\"title\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<label>작성자</label> <input type=\"text\" name=\"writer\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t<!-- <textarea>는 여러줄로 이루어진 텍스트를 다루고 -->\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<label>내용</label>\n");
      out.write("\t\t\t<textarea rows=\"5\" cols=\"50\" name=\"content\"></textarea>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!-- <button>은 버튼의 기능을 수행합니다. -->\n");
      out.write("\t\t<div>\n");
      out.write("\t\t<!-- <button>태그에도 type속성이 있는데,\n");
      out.write("\t\t이 속성은 <input>태그의 속성과 이름이 같지만 기능은 전혀 다릅니다.\n");
      out.write("\t\tsubmit속성은 현재 데이터를 전송한다는 의미입니다.\n");
      out.write("\t\t즉, submit속성이 없으면 아무런 기능도 없습니다 -->\n");
      out.write("\t\t\t<button type=\"submit\">작성</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
