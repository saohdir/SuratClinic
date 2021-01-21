package DB;


import static DB.ForeignKey.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tbl_dokter {
    static Connection connection = null;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        connection = Connector.ConnectDb();
        try{
            sql = "CREATE TABLE tbl_dokter"
            + "(id_dokter CHAR(5) NOT NULL,"
            + "Nama_Dokter VARCHAR(45),"
            + "Jenis_Kelamin VARCHAR(45),"
            + "Tanggal_Lahir DATE,"                     
            + "Email VARCHAR(45),"                    
            + "Alamat VARCHAR(45),"
            + "Nomor_Telepon INT(12),"                   
            + "Spesialis VARCHAR(45),"
            + "Ruangan VARCHAR(6),"  
            + "username_dokter VARCHAR(45),"
            + "password_dokter VARCHAR(6),"                       
            + "PRIMARY KEY (id_dokter))";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = connection.createStatement();
        st.execute(sql);
    }
}