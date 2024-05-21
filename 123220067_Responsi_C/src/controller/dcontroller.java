/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdatadb.datadbDAO;
import DAOImplement.dimplement;
import model.*;
import pkg123220067_responsi_c.mainframe;
/**
 *
 * @author PC PRAKTIKUM
 */
public class dcontroller {
    mainframe fr;
    dimplement impl;
    List<datadb> dp;
    
    public dcontroller(mainframe fr){
        this.fr = fr;
        impl = new datadbDAO();
        dp = impl.getAll();
    }
    public void isitabel(){
        dp = impl.getAll();
        mtd mp = new mtd(dp);
        fr.getTabeldata().setModel(mp);
    }
    public void insert(){
        datadb dp = new datadb();
        double tid = Double.parseDouble(fr.getId().getText());
        double tdurasi = Double.parseDouble(fr.getIdu().getText());
        double ttotal = dp.getTotal();
        
        dp.setId(tid);
        dp.setNama(fr.getIn().getText());
        dp.setJudul(fr.getIju().getText());
        dp.setJenis(fr.getIje().getText());
        dp.setNotlp(fr.getIno().getText());
        dp.setDurasi(tdurasi);
        dp.setTotal(ttotal);
        impl.insert(dp);
    }
    public void update(){
        datadb dp = new datadb();
        double tid = Double.parseDouble(fr.getId().getText());
        double tdurasi = Double.parseDouble(fr.getIdu().getText());
        double ttotal = dp.getTotal();
        
        dp.setId(tid);
        dp.setNama(fr.getIn().getText());
        dp.setJudul(fr.getIju().getText());
        dp.setJenis(fr.getIje().getText());
        dp.setNotlp(fr.getIno().getText());
        dp.setDurasi(tdurasi);
        dp.setTotal(ttotal);
        impl.update(dp);
    }
    public void delete(){
        String del = fr.getIn().getText();
        impl.delete(del);
    }
}
