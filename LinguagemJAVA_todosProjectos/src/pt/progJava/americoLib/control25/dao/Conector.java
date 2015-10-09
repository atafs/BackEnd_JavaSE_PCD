package pt.progJava.americoLib.control25.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.lang.System.*;  

public class Conector {
	
	/*attributes static: belongs to the class*/
	static String url = "jdbc:mysql://localhost/cadastro" ;
    static String usuario = "root";
    static String senha = "";
    static Connection con;
    
    /*return connection*/
    public static Connection getConexao() throws SQLException {

        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            if(con == null){
                con = DriverManager.getConnection(url,usuario,senha);
            }
            out.println("[Conexão efetuada com sucesso...]"); 
            return con;

        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }

}
