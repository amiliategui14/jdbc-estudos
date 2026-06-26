import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Tabela {
    public static void main(String[] args) {
        try (Connection conexao = ConexaoDB.conectar();
            Statement stmt = conexao.createStatement()) {

                //definindo comando SQL para criação da tabela
                String comandoSql = "CREATE TABLE produtos ("+
                        "id_produto INTEGER PRIMARY KEY," +
                        "nome_produto TEXT NOT NULL," +
                        "quantidade INTEGER," +
                        "preco REAL," +
                        "status TEXT" +
                        ");";
                System.out.println(comandoSql);
                
                // executando comando sql
                stmt.execute(comandoSql);

                System.out.println("Tabela 'Produto' criada com sucesso!");
            } catch (SQLException e) {
                System.err.println("Erro ao criar a tabela: " + e.getMessage());
                e.printStackTrace();
            }           
    }
}
