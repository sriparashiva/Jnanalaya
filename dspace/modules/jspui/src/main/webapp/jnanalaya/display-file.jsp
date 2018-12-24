<%--

    Copyright Nithyananda Hindu University 2019

--%>
<%--
  - Reads file with fileName from Dspace install dir/config folder
   and displays it, eg about.html, license
--%>

<%@ page import="org.jnanalaya.app.util.FileUtil"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.dspace.org/dspace-tags.tld" prefix="dspace" %>

<%
    String fileName = config.getInitParameter("fileName");
    String aboutText = FileUtil.readFile(fileName);
%>

<dspace:layout locbar="nolink" titlekey="About">

    <div class="jumbotron">
        <%= aboutText %>
	</div>

    <p><a href="<%= request.getContextPath() %>/"><fmt:message key="jsp.general.gohome"/></a></p>

</dspace:layout>
