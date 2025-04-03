<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%= true %>" var="configurationActionURL" />

<aui:form action="<%= configurationActionURL %>" method="post" name="fm" class="container">
 	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	<liferay-portlet:renderURL portletConfiguration="<%= true %>" var="configurationRenderURL" />

	<aui:input name="redirect" type="hidden" value="<%= configurationRenderURL %>" />

	<aui:fieldset class="container">
		<aui:select label="CountOf" name="countOf" value='<%= (String)portletPreferences.getValue("countOf", "") %>'>
			<aui:option label="Users" value="Users" />
			<aui:option label="Articles" value="Articles" />
			<aui:option label="Documents" value="Documents" />
		</aui:select>
	</aui:fieldset>
	
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>