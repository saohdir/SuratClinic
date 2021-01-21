package DB;



import static DB.tbl_pasien.connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tbl_resepsionis {
    static Connection connection = null;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        connection = Connector.ConnectDb();
        try{
            sql = "CREATE TABLE tbl_resepsionis"
            + "(id_resepsionis CHAR(5) NOT NULL,"
            + "Nama_Resepsionis VARCHAR(45),"
            + "Jenis_Kelamin VARCHAR(45),"
            + "Tanggal_Lahir DATE,"                     
            + "Email VARCHAR(45),"                    
            + "Alamat VARCHAR(45),"
            + "Nomor_Telepon INT(12),"                  
            + "username_resepsionis VARCHAR(45),"
            + "password_resepsionis VARCHAR(6),"                       
            + "PRIMARY KEY (id_resepsionis))";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = connection.createStatement();
        st.execute(sql);
    }
}