


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion {
     private static Connection conex;    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url= "jdbc:mysql://localhost:3306/conexionb?autoReconnect=true&useSSL=false";
         //   "jdbc:mysql://localhost:3306/conexionb";/
     public conexion(){
        conex= null;
        
        try {
            Class.forName(driver);
            conex= (Connection) DriverManager.getConnection(url, user, password);
             
                if(conex!=null){
                    System.out.println("Conectado exitosamente");
                }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexión" + e);
        }
    }

         public Connection getConnection(){
        return conex;
    }
    
    public void desconectar(){
        conex=null;
            if(conex==null){
                System.out.println("Conectado finalizada");
            }  
     }
     }
