<%@ page import="model.Produto" %>

<%
Produto produto = (Produto) request.getAttribute("produto");
%>

<form action="alteraProduto" method="post">
    <input type="hidden" name="id" value="<%= produto.getId() %>">

    Nome: <input type="text" name="nome" value="<%= produto.getNome() %>"><br>
    Unidade Compra: <input type="number" name="unidadeCompra" value="<%= produto.getUnidadeCompra() %>"><br>
    Descrição: <input type="text" name="descricao" value="<%= produto.getDescricao() %>"><br>
    Qtd Previsto: <input type="text" name="qtdPrevistoMes" value="<%= produto.getQtdPrevistoMes() %>"><br>
    Preço Máx: <input type="text" name="precoMaxComprado" value="<%= produto.getPrecoMaxComprado() %>"><br>

    <input type="submit" value="Atualizar">
</form>
