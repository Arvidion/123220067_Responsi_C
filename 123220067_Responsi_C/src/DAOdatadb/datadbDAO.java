/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatadb;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.dimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author PC PRAKTIKUM
 */
public class datadbDAO implements dimplement {
    Connection c;
    
    final String select = "SELECT * FROM sewa_buku";
    final String insert = "INSERT INTO sewa_buku (id,nama_penyewa,judul_buku,jenis_buku,nomor_telepon,durasi_sewa,total_biaya) VALUES (?,?,?,?,?,?,?)";
    final String update = "UPDATE sewa_buku set nama_penyewa=?,judul_buku=?,jenis_buku=?,nomor_telepon=?,durasi_sewa=?,total_biaya=? where id=?";
    final String delete = "DELETE FROM sewa_buku where nama_penyewa=?";
    
    public datadbDAO(){
        c = connector.connection();
    }
    
    @Override
    public void insert(datadb p) {
        PreparedStatement st = null;
        try{
            st = c.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            st.setDouble(1, p.getId());
            st.setString(2, p.getNama());
            st.setString(3, p.getJudul());
            st.setString(4, p.getJenis());
            st.setString(5, p.getNotlp());
            st.setDouble(6, p.getDurasi());
            st.setDouble(7, p.getTotal());
            st.executeUpdate();
            throw new SQLException("Data Ditambahkan");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void update(datadb p) {
        PreparedStatement st = null;
        try{
            st = c.prepareStatement(update);
            st.setDouble(7, p.getId());
            st.setString(1, p.getNama());
            st.setString(2, p.getJudul());
            st.setString(3, p.getJenis());
            st.setString(4, p.getNotlp());
            st.setDouble(5, p.getDurasi());
            st.setDouble(6, p.getTotal());
            st.executeUpdate();
            throw new SQLException("Data Diupdate");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void delete(String nama) {
        PreparedStatement st = null;
        try{
            st = c.prepareStatement(delete);
            st.setString(1, nama);
            st.executeUpdate();
            throw new SQLException("Data Didelete");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<datadb> getAll() {
        List<datadb> dp = null;
        try{
            dp = new ArrayList<datadb>();
            Statement a = c.createStatement();
            ResultSet b = a.executeQuery(select);
            while(b.next()){
                datadb dat = new datadb();
                dat.setId(b.getDouble("id"));
                dat.setNama(b.getString("nama_penyewa"));
                dat.setJudul(b.getString("judul_buku"));
                dat.setJenis(b.getString("jenis_buku"));
                dat.setNotlp(b.getString("nomor_telepon"));
                dat.setDurasi(b.getDouble("Durasi_sewa"));
                dat.setTotal(b.getDouble("total_biaya"));
                dp.add(dat);
            }
        }catch(SQLException e){
            Logger.getLogger(datadbDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return dp;
    }
}
