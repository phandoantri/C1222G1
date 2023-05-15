package service;

import model.ThucPham;

import java.util.List;

public interface IThucPhamService {
    List<ThucPham> getAll();
    void delete( int id);
}
