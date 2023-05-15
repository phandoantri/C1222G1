package repository;

import model.ThucPham;

import java.util.List;

public interface IThucPhamRepository {
    List<ThucPham> getAll();
    void delete(int id);
}
