package DB;



import static DB.ForeignKey.connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tbl_admin {
    static Connection connection = null;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        connection = Connector.ConnectDb();
        try{
            sql = "CREATE TABLE tbl_admin"
            + "(id_admin CHAR(5) NOT NULL,"
            + "id_pasien CHAR(5),"
            + "id_dokter CHAR(5),"
            + "id_resepsionis CHAR(5),"                    
            + "username VARCHAR(45),"
            + "password VARCHAR(45),"
            + "PRIMARY KEY (id_admin))";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = connection.createStatement();
        st.execute(sql);
    }
}