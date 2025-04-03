<%@page import="ignek.intranet.color.configuration.ColorConfiguration"%>
<%@ include file="/init.jsp" %>

<h4>Color Configuration</h4>


<%
String color = (String)portletPreferences.getValue("color", "");

if (color.equals("")) {
	ColorConfiguration colorConfiguration = (ColorConfiguration)request.getAttribute(ColorConfiguration.class.getName());

	color = colorConfiguration.color();
}
%>

Color: <%= color %>
