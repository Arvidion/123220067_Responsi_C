/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class mtd extends AbstractTableModel{
    List<datadb> dp;
    public mtd(List<datadb>dp){
        this.dp = dp;
    }
    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Id";
            case 1: return "Nama Penyewa";
            case 2: return "Judul buku";
            case 3: return "Jenis Buku";
            case 4: return "Nomor Telepon";
            case 5: return "Durasi Sewa";
            case 6: return "Total Biaya";
            default: return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0: return dp.get(row).getId();
            case 1: return dp.get(row).getNama();
            case 2: return dp.get(row).getJudul();
            case 3: return dp.get(row).getJenis();
            case 4: return dp.get(row).getNotlp();
            case 5: return dp.get(row).getDurasi();
            case 6: return dp.get(row).getTotal();
            default: return null;
        }
    }
    
}
