package DB;



import static DB.tbl_dokter.connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tbl_janji {
    static Connection connection = null;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        connection = Connector.ConnectDb();
        try{
            sql = "CREATE TABLE tbl_janji"
            + "(id_janji CHAR(5) NOT NULL,"
            + "id_dokter VARCHAR(45),"
            + "id_pasien VARCHAR(45),"
            + "Nama_Pasien VARCHAR(45),"                     
            + "Nama_Dokter VARCHAR(45),"                    
            + "Ruangan VARCHAR(6),"                       
            + "PRIMARY KEY (id_janji))";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = connection.createStatement();
        st.execute(sql);
    }
}