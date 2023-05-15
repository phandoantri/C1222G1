package model;
public class LoaiThucPham {
    private int idLTP;
    private String tenLTP;

    public LoaiThucPham() {
    }

    public LoaiThucPham(int idLTP, String tenLTP) {
        this.idLTP = idLTP;
        this.tenLTP = tenLTP;
    }

    public int getIdLTP() {
        return idLTP;
    }

    public void setIdLTP(int idLTP) {
        this.idLTP = idLTP;
    }

    public String getTenLTP() {
        return tenLTP;
    }

    public void setTenLTP(String tenLTP) {
        this.tenLTP = tenLTP;
    }
}
