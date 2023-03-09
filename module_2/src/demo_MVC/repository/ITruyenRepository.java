package demo_MVC.repository;

import demo_MVC.model.Truyen;

import java.util.List;

public interface ITruyenRepository {
    List<Truyen> hienThi();
    void xoa(String ma);
}
