/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-14 10:46:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webmenu_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tags/menuItem.tag", Long.valueOf(1631612981000L));
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fhtmlEscape_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String name;

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
    jspContext.setAttribute("name", name);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fhtmlEscape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fhtmlEscape_005fnobody.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getName() != null ) 
      _jspx_page_context.setAttribute("name", getName());

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"><span></span></a>\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\">\n");
      out.write("                <span class=\"sr-only\"><os-p>Toggle navigation</os-p></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_petclinic_005fmenuItem_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_petclinic_005fmenuItem_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_petclinic_005fmenuItem_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_petclinic_005fmenuItem_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/menu.tag(10,42) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/");
    // /WEB-INF/tags/menu.tag(10,42) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setHtmlEscape(true);
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_petclinic_005fmenuItem_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:menuItem
    org.apache.jsp.tag.webmenuItem_tag _jspx_th_petclinic_005fmenuItem_005f0 = (new org.apache.jsp.tag.webmenuItem_tag());
    _jsp_instancemanager.newInstance(_jspx_th_petclinic_005fmenuItem_005f0);
    _jspx_th_petclinic_005fmenuItem_005f0.setJspContext(_jspx_page_context);
    _jspx_th_petclinic_005fmenuItem_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/menu.tag(21,16) name = active type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f0.setActive((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name eq 'home'}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/menu.tag(21,16) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f0.setUrl("/");
    // /WEB-INF/tags/menu.tag(21,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f0.setTitle("home page");
    _jspx_th_petclinic_005fmenuItem_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_petclinic_005fmenuItem_005f0, null));
    _jspx_th_petclinic_005fmenuItem_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_petclinic_005fmenuItem_005f0);
    return false;
  }

  private boolean _jspx_meth_petclinic_005fmenuItem_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:menuItem
    org.apache.jsp.tag.webmenuItem_tag _jspx_th_petclinic_005fmenuItem_005f1 = (new org.apache.jsp.tag.webmenuItem_tag());
    _jsp_instancemanager.newInstance(_jspx_th_petclinic_005fmenuItem_005f1);
    _jspx_th_petclinic_005fmenuItem_005f1.setJspContext(_jspx_page_context);
    _jspx_th_petclinic_005fmenuItem_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/menu.tag(26,16) name = active type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f1.setActive((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name eq 'owners'}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/menu.tag(26,16) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f1.setUrl("/owners/find.html");
    // /WEB-INF/tags/menu.tag(26,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f1.setTitle("find owners");
    _jspx_th_petclinic_005fmenuItem_005f1.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_petclinic_005fmenuItem_005f1, null));
    _jspx_th_petclinic_005fmenuItem_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_petclinic_005fmenuItem_005f1);
    return false;
  }

  private boolean _jspx_meth_petclinic_005fmenuItem_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:menuItem
    org.apache.jsp.tag.webmenuItem_tag _jspx_th_petclinic_005fmenuItem_005f2 = (new org.apache.jsp.tag.webmenuItem_tag());
    _jsp_instancemanager.newInstance(_jspx_th_petclinic_005fmenuItem_005f2);
    _jspx_th_petclinic_005fmenuItem_005f2.setJspContext(_jspx_page_context);
    _jspx_th_petclinic_005fmenuItem_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/menu.tag(31,16) name = active type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f2.setActive((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name eq 'vets'}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/menu.tag(31,16) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f2.setUrl("/vets.html");
    // /WEB-INF/tags/menu.tag(31,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f2.setTitle("veterinarians");
    _jspx_th_petclinic_005fmenuItem_005f2.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_petclinic_005fmenuItem_005f2, null));
    _jspx_th_petclinic_005fmenuItem_005f2.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_petclinic_005fmenuItem_005f2);
    return false;
  }

  private boolean _jspx_meth_petclinic_005fmenuItem_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  petclinic:menuItem
    org.apache.jsp.tag.webmenuItem_tag _jspx_th_petclinic_005fmenuItem_005f3 = (new org.apache.jsp.tag.webmenuItem_tag());
    _jsp_instancemanager.newInstance(_jspx_th_petclinic_005fmenuItem_005f3);
    _jspx_th_petclinic_005fmenuItem_005f3.setJspContext(_jspx_page_context);
    _jspx_th_petclinic_005fmenuItem_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/menu.tag(36,16) name = active type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f3.setActive((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name eq 'error'}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/menu.tag(36,16) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f3.setUrl("/oups.html");
    // /WEB-INF/tags/menu.tag(36,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_petclinic_005fmenuItem_005f3.setTitle("trigger a RuntimeException to see how it is handled");
    _jspx_th_petclinic_005fmenuItem_005f3.setJspBody(new Helper( 3, _jspx_page_context, _jspx_th_petclinic_005fmenuItem_005f3, null));
    _jspx_th_petclinic_005fmenuItem_005f3.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_petclinic_005fmenuItem_005f3);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("                    <span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span>Home</span>\n");
      out.write("                ");
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("                    <span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span>Find owners</span>\n");
      out.write("                ");
      return false;
    }
    public boolean invoke2( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("                    <span class=\"glyphicon glyphicon-th-list\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span>Veterinarians</span>\n");
      out.write("                ");
      return false;
    }
    public boolean invoke3( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("                    <span class=\"glyphicon glyphicon-warning-sign\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span>Error</span>\n");
      out.write("                ");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
