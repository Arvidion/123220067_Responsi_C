/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class datadb {
    private double id;
    private String nama;
    private String judul;
    private String jenis;
    private String notlp;
    private double durasi;
    private double total;

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public double getDurasi() {
        return durasi;
    }

    public void setDurasi(double durasi) {
        this.durasi = durasi;
    }

    public double getTotal() {
        if(durasi <= 2){
            total = 10000;
            return total;
        }
        else{
            total =  10000*2 + (durasi-2)*5000;
            return total;
        }
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
}
