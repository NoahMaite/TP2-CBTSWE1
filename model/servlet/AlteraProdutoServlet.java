package servlet;

import banco.Banco;
import model.Produto;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        String nome = request.getParameter("nome");
        int unidade = Integer.parseInt(request.getParameter("unidadeCompra"));
        String descricao = request.getParameter("descricao");
        double qtd = Double.parseDouble(request.getParameter("qtdPrevistoMes"));
        double preco = Double.parseDouble(request.getParameter("precoMaxComprado"));

        Banco banco = new Banco();
        Produto produto = banco.buscaProduto(id);

        produto.setNome(nome);
        produto.setUnidadeCompra(unidade);
        produto.setDescricao(descricao);
        produto.setQtdPrevistoMes(qtd);
        produto.setPrecoMaxComprado(preco);

        response.sendRedirect("listaProdutos");
    }
}
