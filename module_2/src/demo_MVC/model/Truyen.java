package demo_MVC.model;

public class Truyen {
private String ten;
private String ma;
private String tacGia;
private String nhaXuatBan;

    public Truyen(String ten, String ma, String tacGia,String nhaXuatBan) {
        this.ten = ten;
        this.ma = ma;
        this.tacGia = tacGia;
        this.nhaXuatBan=nhaXuatBan;
    }
    public Truyen(){
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return "Truyen{" +
                "ten='" + ten + '\'' +
                ", ma='" + ma + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                '}';
    }
}
