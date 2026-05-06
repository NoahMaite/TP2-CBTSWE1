package servlet;

import banco.Banco;
import model.Produto;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/mostraProduto")
public class MostraProdutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Banco banco = new Banco();
        Produto produto = banco.buscaProduto(id);

        request.setAttribute("produto", produto);

        request.getRequestDispatcher("formAlteraProduto.jsp").forward(request, response);
    }
}
