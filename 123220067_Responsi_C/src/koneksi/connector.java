/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author PC PRAKTIKUM
 */
public class connector {
    static Connection c;
    public static Connection connection(){
        if(c == null){
            MysqlDataSource d = new MysqlDataSource();
            d.setDatabaseName("responsi");
            d.setUser("root");
            d.setPassword("");
            try{
                c = d.getConnection();
                System.out.println("Koneksi Berhasil");
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("Koneksi Gagal");
            }
        }
        return c;
    }
}
