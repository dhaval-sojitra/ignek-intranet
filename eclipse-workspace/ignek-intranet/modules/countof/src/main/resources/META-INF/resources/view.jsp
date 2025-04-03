<%@ include file="/init.jsp" %>

<%
String countOf = (String)portletPreferences.getValue("countOf","Users");

String countOfValue = (String)request.getAttribute("countOfValue");

if(countOf.equals("")){
	CountOfConfiguration _countConfiguration = (CountOfConfiguration) request.getAttribute(CountOfConfiguration.class.getName());
	countOf = _countConfiguration.countOf();
}
%>

<div class="countof_card">
	<p><%= countOf %> </p>
	<h1><%= countOfValue  %></h1>
</div>
