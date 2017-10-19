<%--
    Document   : PaysSelectFragment
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>Les pays</h3>

<c:forEach var="pays" items="${listePays}">
	${pays.idPays} - ${pays.nomPays} <br/>
</c:forEach>