package banco;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class Banco {

    private static List<Produto> lista = new ArrayList<>();
    private static int chaveSequencial = 1;

    public void adiciona(Produto produto) {
        produto.setId(chaveSequencial++);
        lista.add(produto);
    }

    public List<Produto> getProdutos() {
        return lista;
    }

    public void removeProduto(int id) {
        Produto produto = buscaProduto(id);
        lista.remove(produto);
    }

    public Produto buscaProduto(int id) {
        for (Produto p : lista) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
