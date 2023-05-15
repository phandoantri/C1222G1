package model;

public class CongViec {
    private int idCongViec;
    private String tenCongViec;
    private String ngayThucHien;
    private String deadLine;
    private int idTrangThai;
    private String trangThai;
    private String moTaThem;

    public CongViec() {
    }

    public CongViec(int idCongViec, String tenCongViec, String ngayThucHien, String deadLine, int idTrangThai, String trangThai, String moTaThem) {
        this.idCongViec = idCongViec;
        this.tenCongViec = tenCongViec;
        this.ngayThucHien = ngayThucHien;
        this.deadLine = deadLine;
        this.idTrangThai = idTrangThai;
        this.trangThai = trangThai;
        this.moTaThem = moTaThem;
    }

    public CongViec(int idCongViec, String tenCongViec, String ngayThucHien, String deadLine, String trangThai, String moTaThem) {
        this.idCongViec = idCongViec;
        this.tenCongViec = tenCongViec;
        this.ngayThucHien = ngayThucHien;
        this.deadLine = deadLine;
        this.trangThai = trangThai;
        this.moTaThem = moTaThem;
    }

    public int getIdCongViec() {
        return idCongViec;
    }

    public void setIdCongViec(int idCongViec) {
        this.idCongViec = idCongViec;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(String ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public int getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(int idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }
}
