<%@ page import="java.util.List" %>
<%@ page import="model.Produto" %>

<%
List<Produto> lista = (List<Produto>) request.getAttribute("produtos");
%>

<ul>
<% for (Produto p : lista) { %>
    <li>
        <%= p.getNome() %>
        <a href="mostraProduto?id=<%= p.getId() %>">Editar</a>
        <a href="removeProduto?id=<%= p.getId() %>">Excluir</a>
    </li>
<% } %>
</ul>

<a href="index.jsp">Voltar</a>
