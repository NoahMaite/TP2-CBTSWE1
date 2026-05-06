package servlet;

import banco.Banco;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/listaProdutos")
public class ListaProdutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Banco banco = new Banco();
        request.setAttribute("produtos", banco.getProdutos());

        request.getRequestDispatcher("listaProdutos.jsp").forward(request, response);
    }
}
