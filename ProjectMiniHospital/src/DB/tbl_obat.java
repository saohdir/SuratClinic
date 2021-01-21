/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import static DB.tbl_dokter.connection;
import static DB.tbl_janji.connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author surap
 */
public class tbl_obat {
        static Connection connection = null;
    static Statement st;
    static String sql;


    public static void main(String[] args) throws SQLException {
        connection = Connector.ConnectDb();
        try{
            sql = "CREATE TABLE tbl_obat"
            + "(id_obat CHAR(5) NOT NULL,"
            + "Nama_Obat VARCHAR(45),"
            + "Tipe_Obat VARCHAR(45),"
            + "Harga VARCHAR(45),"                                        
            + "PRIMARY KEY (id_obat))";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = connection.createStatement();
        st.execute(sql);
    }}