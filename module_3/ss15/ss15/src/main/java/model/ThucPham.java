package model;

import java.sql.Date;

public class ThucPham {
    private int idThucPham;
    private String tenThucPham;
    private String NSX;
    private String HSD;
    private int idLTP;
    private String moTa;
    private String tenLTP;


    public ThucPham() {
    }

    public ThucPham(int idThucPham, String tenThucPham, String NSX, String HSD, int idLTP, String moTa) {
        this.idThucPham = idThucPham;
        this.tenThucPham = tenThucPham;
        this.NSX = NSX;
        this.HSD = HSD;
        this.idLTP = idLTP;
        this.moTa = moTa;
    }

    public ThucPham(int id, String ten, String nxs, String hsd, int idLTP, String moTa, String tenLTP) {
        this.idThucPham = id;
        this.tenThucPham = ten;
        this.NSX = nxs;
        this.HSD = hsd;
        this.idLTP = idLTP;
        this.moTa = moTa;
        this.tenLTP=tenLTP;
    }

    public int getIdThucPham() {
        return idThucPham;
    }

    public void setIdThucPham(int idThucPham) {
        this.idThucPham = idThucPham;
    }

    public String getTenThucPham() {
        return tenThucPham;
    }

    public void setTenThucPham(String tenThucPham) {
        this.tenThucPham = tenThucPham;
    }


    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getHSD() {
        return HSD;
    }

    public void setHSD(String HSD) {
        this.HSD = HSD;
    }

    public int getIdLTP() {
        return idLTP;
    }

    public void setIdLTP(int idLTP) {
        this.idLTP = idLTP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenLTP() {
        return tenLTP;
    }

    public void setTenLTP(String tenLTP) {
        this.tenLTP = tenLTP;
    }
}
