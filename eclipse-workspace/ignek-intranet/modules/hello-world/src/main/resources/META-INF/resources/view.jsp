<%@ include file="/init.jsp" %>

<h1>Hello World</h1>

<h3>Total Users : <%= request.getAttribute("totalUsers") %></h3>
<h3>Total Articles : <%= request.getAttribute("totalArticles") %></h3>
<h3>Total Documents : <%= request.getAttribute("totalDocuments") %></h3>