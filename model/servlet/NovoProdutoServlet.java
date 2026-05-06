package servlet;

import banco.Banco;
import model.Produto;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/novoProduto")
public class NovoProdutoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        int unidade = Integer.parseInt(request.getParameter("unidadeCompra"));
        String descricao = request.getParameter("descricao");
        double qtd = Double.parseDouble(request.getParameter("qtdPrevistoMes"));
        double preco = Double.parseDouble(request.getParameter("precoMaxComprado"));

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setUnidadeCompra(unidade);
        produto.setDescricao(descricao);
        produto.setQtdPrevistoMes(qtd);
        produto.setPrecoMaxComprado(preco);

        Banco banco = new Banco();
        banco.adiciona(produto);

        response.sendRedirect("listaProdutos");
    }
}
