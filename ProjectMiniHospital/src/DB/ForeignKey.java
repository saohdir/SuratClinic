package DB;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ForeignKey {
    static Connection connection = null;
    static Statement st;
    static String sql;

    public static void main(String[] args) throws SQLException {
        connection = Connector.ConnectDb();
        try{
            sql = "ALTER TABLE tbl_janji ADD FOREIGN KEY (id_pasien) references tbl_pasien (id_pasien)";
            }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        st = connection.createStatement();
        st.execute(sql);
    }
}