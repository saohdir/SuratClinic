package DB;



import static DB.tbl_janji.connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tbl_pasien {
    static Connection connection = null;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        connection = Connector.ConnectDb();
        try{
            sql = "CREATE TABLE tbl_pasien"
            + "(id_pasien CHAR(5) NOT NULL,"
            + "Nama_Pasien VARCHAR(45),"
            + "Jenis_Kelamin VARCHAR(45),"
            + "Usia INT(2),"                    
            + "Alamat VARCHAR(45),"
            + "Nomor_Telepon INT(12),"                   
            + "Penyakit VARCHAR(45),"
            + "Ruangan VARCHAR(6),"  
            + "Tanggal DATE,"                       
            + "PRIMARY KEY (id_pasien))";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = connection.createStatement();
        st.execute(sql);
    }
}