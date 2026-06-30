import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //conexão com DB
        try (Connection conexao = ConexaoDB.conectar()) {
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

/* 
            //Lista todos os produtos
            mostrarProdutos(produtoDAO);

            //adicionar produtos
            Produto novoProduto1 = new Produto("Notebook", 10, 1999.99, "Em estoque");
            Produto novoProduto2 = new Produto("Smartphone", 20, 2499.99, "Estoque Baixo");
            Produto novoProduto3 = new Produto("Tablet", 15, 799.00, "Estoque Baixo");

            produtoDAO.inserir(novoProduto1);
            produtoDAO.inserir(novoProduto2);
            produtoDAO.inserir(novoProduto3);

            //excluir por ID
            produtoDAO.excluir(6);

            //excluir Todos
            produtoDAO.excluirTodos();
*/
            // Lista todos os produtos após a inserção
            mostrarProdutos(produtoDAO);

        } catch (Exception e) {
            System.err.println("Erro geral: " + e.getMessage());
        }
    }

    // Listar produtos
    private static void mostrarProdutos(ProdutoDAO produtoDAO) {
        List<Produto> todosProdutos = produtoDAO.listarTodos();
        if (todosProdutos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto p : todosProdutos) {
                System.out.println(p.getId() + ": " + p.getNome() + " - " + p.getPreco());
            }
        }
    }
}
