<%--
    Document : PaysDeleteFragment.jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h3>Suppression d'un Pays</h3>

<form action="/WebAppHibernateCours/ControleurPays" method='POST'>
    <label>ID du pays</label>
    <input type="text" name="idPays" value="36" />

    <input type="hidden" name="action" value="deleteValider" />

    <input type="submit" />
</form>