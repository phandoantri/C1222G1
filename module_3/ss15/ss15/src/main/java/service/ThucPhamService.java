package service;

import model.ThucPham;
import repository.IThucPhamRepository;
import repository.ThucPhamRepository;

import java.util.List;

public class ThucPhamService implements IThucPhamService{
    private IThucPhamRepository iThucPhamRepository=new ThucPhamRepository();
    @Override
    public List<ThucPham> getAll() {
        return iThucPhamRepository.getAll();
    }

    @Override
    public void delete(int id) {
        iThucPhamRepository.delete(id);
    }
}
