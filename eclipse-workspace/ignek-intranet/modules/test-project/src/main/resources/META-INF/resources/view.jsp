<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="testclass.caption"/></b>
</p>

<h3>Welcome... View 1</h3>

<portlet:renderURL var="view2URL">
	<portlet:param name="mvcPath" value="/view2.jsp" />
</portlet:renderURL>

<a href="<%= view2URL %>">Go to View 2</a>