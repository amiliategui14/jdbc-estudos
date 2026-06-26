import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
        private static final String URL_JDBC_PADRAO = "jdbc:sqlite:banco.db";

        public static Connection conectar() {
            try {
                return DriverManager.getConnection(URL_JDBC_PADRAO);
            } catch (SQLException e) {
                System.err.println("Erro ao conectar ao  banco de dados: " + e.getMessage());
                return null;
            }
        }

        public static Connection conectarGenerico(String url, String usuario, String senha) {
            try {
                return DriverManager.getConnection(url, usuario, senha);
            } catch (SQLException e) {
                System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
                return null;
            }
        }

         public static void main(String[] args) {
        Connection conexao = conectar();

        if (conexao != null) {
            System.out.println("Conectado com sucesso!");
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

    
