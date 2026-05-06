package servlet;

import banco.Banco;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/removeProduto")
public class RemoveProdutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Banco banco = new Banco();
        banco.removeProduto(id);

        response.sendRedirect("listaProdutos");
    }
}
