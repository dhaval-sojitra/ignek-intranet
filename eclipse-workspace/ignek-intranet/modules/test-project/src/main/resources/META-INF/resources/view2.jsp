<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="testclass.caption"/></b>
</p>

<h3>View 2</h3>

<portlet:renderURL var="view2URL">
	<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>

<a href="<%= view2URL %>">Go to View 1</a>

<portlet:actionURL name="doSomething" var="actionURL" />

<p>
	<a href="<%= actionURL %>">Do Something</a></p>
<p>
	<a href="<portlet:actionURL name="doSomethingElse" />">Do Something Else</a>
</p>

<p>
	<a href="<portlet:actionURL><portlet:param name="javax.portlet.action" value="nameForTheDoSomethingMoreMethod" /></portlet:actionURL>">Do Something More</a>
</p> 